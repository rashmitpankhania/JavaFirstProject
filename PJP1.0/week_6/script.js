var make = () => {
    var tableBody = document.querySelector(".table tbody");
    var expression = document.calculator.ans.value;
    var ans = eval(expression);
    tableBody.innerHTML+='<tr><th scope="row">'+tableBody.rows.length+'</th><td>'+expression+'</td><td>'+ ans+'</td></tr>';
    document.calculator.ans.value = ans;
};