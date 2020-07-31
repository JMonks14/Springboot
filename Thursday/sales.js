fetch('http://localhost:8010/showsales', {
    method: "GET"
   })
  .then(
    function(response) {
      if (response.status !== 200) {
        console.log('Looks like there was a problem. Status Code: ' +
          response.status);
        return;
      }
      // Examine the text in the response
      response.json().then(function(data) {
        console.log(data);
        for (let i =0; i<data.length;i++) {
          console.log("id",data[i].salesid);
          console.log("name",data[i].product_name);
          console.log("quantity",data[i].quantity);
  
        //   let tbody = document.getElementById("salest"); // Create a <p> element
          let row  = `<tr><th scope="row">${(data[i].salesid)}</th>
          <td>${(data[i].product_name)}</td>
          <td>${(data[i].quantity)}</td>
          <td><a href="http://localhost:8010/deleterecord/${(data[i].salesid)}">delete</a></td></tr>
          `
        document.getElementById("salest").innerHTML+=row;
        }
      });
    }
  )
  .catch(function(err) {
    console.log('Fetch Error :-S', err);
  });

  

 
document.querySelector("#addprod").addEventListener("submit",function(e) {
      e.preventDefault();
      let x = document.querySelector("#addprod").elements;

      let product_name = x["prodnameinput"].value;
      let quantity = parseInt(x["quantinput"].value);

      console.log(product_name);
      console.log(quantity);

      const data = {
          "product_name": product_name,
          "quantity": quantity  
      }

      console.log(data);

    //   console.log(JSON.stringify(data));

      fetch("http://localhost:8010/addrecord", {
          method: "POST",
          mode: "cors",
          headers: {
              "Content-Type": "application/json",
          },
          body: JSON.stringify(data)
      }).then(response => response)
      .then(function (data) {
          console.log("Request succeeded with JSON response",data);
      }).catch(function(error) {
          console.log("Request failed", error);
      })
    });
    
