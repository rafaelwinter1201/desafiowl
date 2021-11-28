function mascara(i){
   
   var v = i.value;
   
   if(isNaN(v[v.length-1])){ // impede entrar outro caractere que não seja número
      i.value = v.substring(0, v.length-1);
      return;
   }
   
   i.setAttribute("maxlength", "14");
   if (v.length == 3 || v.length == 7) i.value += ".";
   if (v.length == 11) i.value += "-";

}
function VerificaCPF(strCpf) {

var soma;
var resto;
soma = 0;
if (strCpf == "00000000000") {
    return false;
}

for (i = 1; i <= 9; i++) {
    soma = soma + parseInt(strCpf.substring(i - 1, i)) * (11 - i);
}

resto = soma % 11;

if (resto == 10 || resto == 11 || resto < 2) {
    resto = 0;
} else {
    resto = 11 - resto;
}

if (resto != parseInt(strCpf.substring(9, 10))) {
    return false;
}

soma = 0;

for (i = 1; i <= 10; i++) {
    soma = soma + parseInt(strCpf.substring(i - 1, i)) * (12 - i);
}
resto = soma % 11;

if (resto == 10 || resto == 11 || resto < 2) {
    resto = 0;
} else {
    resto = 11 - resto;
}

if (resto != parseInt(strCpf.substring(10, 11))) {
    return false;
}

return true;
}

