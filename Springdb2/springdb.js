function GetRecords(){
    fetch('http://localhost:8010/allstudents')
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
          console.log("refno",data[i].regno);
          console.log("name",data[i].name);
          console.log("address",data[i].address);
  
          let para = document.createElement("P"); // Create a <p> element
          para.className ="data alert alert-danger col-md-8";
          para.innerText = `
          ${(data[i].regno)}
          ${(data[i].name)}
          ${(data[i].address)}
          `
        let myDiv = document.getElementById("notes");
          myDiv.appendChild(para);
        }
      });
    }
  )
  .catch(function(err) {
    console.log('Fetch Error :-S', err);
  });
};

document.getElementById("abutton").addEventListener("click", GetRecords);