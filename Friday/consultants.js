fetch('http://localhost:8010/listofclients', {
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
          console.log("client",data[i]);
         
  
        //   let tbody = document.getElementById("salest"); // Create a <p> element
          let row  = `<tr>
          <td><a href="http://localhost:8010//clientconsultants/${(data[i])}">${(data[i])}</a></td></tr>
          `
          let formoption = `<option>${data[i]}</option>`
        document.getElementById("clients").innerHTML+=row;
        document.getElementById("clientselect").innerHTML+=formoption;
        }
      });
    }
  )
  .catch(function(err) {
    console.log('Fetch Error :-S', err);
  });

  fetch('http://localhost:8010/listoftechs', {
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
          console.log("tech",data[i]);
         
  
        //   let tbody = document.getElementById("salest"); // Create a <p> element
          let row  = `<tr>
          <td><a href="http://localhost:8010//techconsultants/${(data[i])}">${(data[i])}</a></td></tr>
          `
        document.getElementById("techs").innerHTML+=row;
        }
      });
    }
  )
  .catch(function(err) {
    console.log('Fetch Error :-S', err);
  });

  function getClientMaxSalary(client) {
    fetch(`http://localhost:8010/maxsalary/${client}`, {
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
            //   console.log("client",data[i]);
             
      
            //   let tbody = document.getElementById("salest"); // Create a <p> element
              let row  = `<tr>
              <td>${(data[i].regno)}</td>
              <td>${(data[i].name)}</td>
              <td>${(data[i].address)}</td>
              <td>${(data[i].tech)}</td>
              <td>${(data[i].client)}</td>
              <td>${(data[i].salary)}</td>
              <td>${(data[i].marks)}</td>
              </tr>
              `
            document.getElementById("trainees").innerHTML+=row;
            }
          });
        }
      )
      .catch(function(err) {
        console.log('Fetch Error :-S', err);
      });
  }
  document.querySelector("#getinfo").addEventListener("submit",function(e) {
    e.preventDefault();
    document.getElementById("trainees").innerHTML=""
    let x = document.querySelector("#getinfo").elements;

    let option = x["optionselect"].value;
    let client = x["clientselect"].value;

    if (option==="Consultant(s) with highest salary") {
        getClientMaxSalary(client)
    } else if (option==="Consultant(s) with highest marks") {
        getClientMaxMarks(client)
    } else if (option==="Consultants with below average salary") {
        getbelAvgSalary(client)
    }
    
  })

  function getClientMaxMarks(client) {
    fetch(`http://localhost:8010/maxmarks/${client}`, {
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
            //   console.log("client",data[i]);
             
      
            //   let tbody = document.getElementById("salest"); // Create a <p> element
              let row  = `<tr>
              <td>${(data[i].regno)}</td>
              <td>${(data[i].name)}</td>
              <td>${(data[i].address)}</td>
              <td>${(data[i].tech)}</td>
              <td>${(data[i].client)}</td>
              <td>${(data[i].salary)}</td>
              <td>${(data[i].marks)}</td>
              </tr>
              `
            document.getElementById("trainees").innerHTML+=row;
            }
          });
        }
      )
      .catch(function(err) {
        console.log('Fetch Error :-S', err);
      });
  }

  function getbelAvgSalary(client) {
    fetch(`http://localhost:8010/belavgsalary/${client}`, {
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
            //   console.log("client",data[i]);
             
      
            //   let tbody = document.getElementById("salest"); // Create a <p> element
              let row  = `<tr>
              <td>${(data[i].regno)}</td>
              <td>${(data[i].name)}</td>
              <td>${(data[i].address)}</td>
              <td>${(data[i].tech)}</td>
              <td>${(data[i].client)}</td>
              <td>${(data[i].salary)}</td>
              <td>${(data[i].marks)}</td>
              </tr>
              `
            document.getElementById("trainees").innerHTML+=row;
            }
          });
        }
      )
      .catch(function(err) {
        console.log('Fetch Error :-S', err);
      });
  }