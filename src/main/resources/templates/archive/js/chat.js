const gender = document.getElementById("gender_button");
const age = document.getElementById("age_button");
const type = document.getElementById("type_button");
const weight = document.getElementById("weight_button");
const summary = document.getElementById("summary_button");

const gender1 = document.getElementsByClassName("gender1");
const gender2 = document.getElementsByClassName("gender2");
const age1 = document.getElementsByClassName("age1");
const age2 = document.getElementsByClassName("age2");
const type1 = document.getElementsByClassName("type1");
const type2 = document.getElementsByClassName("type2");
const weight1 = document.getElementsByClassName("weight1");
const weight2 = document.getElementsByClassName("weight2");
const summaryM = document.getElementsByClassName("summary");


function genderClick(){
     gender1[0].style.display = 'block';
     gender2[0].style.display = 'block';
 }
function ageClick(){
    age1[0].style.display = 'block';
    age2[0].style.display = 'block';
}
function typeClick(){
    type1[0].style.display = 'block';
    type2[0].style.display = 'block';
}
function weightClick(){
    weight1[0].style.display = 'block';
    weight2[0].style.display = 'block';
}
function summaryClick(){
    summaryM[0].style.display = 'block';
}


gender.addEventListener("click", genderClick);
age.addEventListener("click", ageClick);
type.addEventListener("click", typeClick);
weight.addEventListener("click", weightClick);
summary.addEventListener("click", summaryClick);
