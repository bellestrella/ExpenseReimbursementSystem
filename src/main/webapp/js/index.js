
    fetch('empJSON.json')
        .then(function (response) {
            return response.json();
        })
        .then(function (data) {
            appendData(data);
        })
        .catch(function (err) {
            console.log('error: ' + err);
        });
    function appendData(data) {
        var mainContainer = document.getElementById("allEmployees");
        var Employee_Data = data['Employee_Data']
        for (var i = 0; i < Employee_Data.length; i++) {
            var div = document.createElement("div");
            div.innerHTML = 'Name: ' + Employee_Data[i].FirstName + ' ' + Employee_Data[i].LastName + ' Employee ID: ' + Employee_Data[i].EmpID + ' Country: ' + Employee_Data[i].Country + ' Pending Requests: ' + Employee_Data[i].PendingRequests;
            mainContainer.appendChild(div);
        }
    }
