const displayToday = () => {
  const d = new Date();
  document.getElementById("todayDate").innerHTML = d.toLocaleDateString();
};

const displayYesterday = () => {
  const d = new Date();
  d.setDate(d.getDate()-1);
  document.getElementById("yesterdayDate").innerHTML = d.toLocaleDateString();
};

const displayTomorrow = () => {
  const d = new Date();
  d.setDate(d.getDate()+1);
  document.getElementById("tomorrowDate").innerHTML = d.toLocaleDateString();
};