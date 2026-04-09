let jobs = [
  { title: "Frontend Developer", company: "TCS", logo: "https://i.pinimg.com/736x/aa/a2/45/aaa245759726ab04e968b9bff4981a52.jpg" },
  { title: "Backend Developer", company: "Infosys", logo: "https://i.pinimg.com/736x/89/0c/25/890c250fe129488a586b1a99e8b68107.jpg" },
  { title: "Software Engineer", company: "Wipro", logo: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSL2a418p8twUZDZKHOggy9fkZSrnxyUZw6Bg&s" }
];

function display(jobsList) {
    const div = document.getElementById("jobs");
    div.innerHTML = "";

    jobsList.forEach(j => {
        div.innerHTML += `
        <div class="job">
            <img src="${j.logo}" width="50">
            <h3>${j.title}</h3>
            <p>${j.company}</p>
            <a href="apply.html">
                <button>Apply</button>
            </a>
        </div>`;
    });
}

display(jobs);