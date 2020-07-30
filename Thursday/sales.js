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
          <td>${(data[i].quantity)}</td></tr>
          `
        document.getElementById("salest").innerHTML+=row;
        }
      });
    }
  )
  .catch(function(err) {
    console.log('Fetch Error :-S', err);
  });
