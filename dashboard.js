const orgId = localStorage.getItem("orgId");

fetch(`/api/dashboard/${orgId}`)
.then(res => res.json())
.then(data => {
    new Chart(document.getElementById("carbonChart"), {
        type: "bar",
        data: {
            labels: data.months,
            datasets: [{
                label: "CO₂ Emission",
                data: data.values
            }]
        }
    });
});