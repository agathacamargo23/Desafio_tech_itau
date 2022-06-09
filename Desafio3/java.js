var txtResult = document.getElementById('txtResult')
var txtResult2 = document.getElementById('txtResult2')


var numeroRomano = document.getElementById('txtNumero')

function verificarNumerosRomanos() {
    var caracter = "";
    var caracterSeguinte = "";
    var digitoRomano = 0;

    var digitoRomanoemconjunto = 0;
    var soma = 0;

    for (var i = 0; i < numeroRomano.value.length; i++) {
        caracter = numeroRomano.value.charAt(i);
        caracterSeguinte = numeroRomano.value.charAt(i + 1);


        switch (caracter) {
            case 'I': 

                if (caracter == 'I' && caracterSeguinte == 'V') {
                    digitoRomanoemconjunto += 4;
                    digitoRomano = 0;
               
                }

                else if (caracter == 'I' && caracterSeguinte == 'X') {
                    digitoRomanoemconjunto += 9;
                    digitoRomano = 0;
                }else{
                    digitoRomano += 1;
                }


                break;

            case 'V':

            if (caracter == 'I' && caracterSeguinte == 'V') {
                digitoRomanoemconjunto += 4;
                digitoRomano = 0;
            }else{
                digitoRomano += 5;
            }
                break;

            case 'X': 

             if (caracter == 'I' && caracterSeguinte == 'X') {
                digitoRomanoemconjunto += 9;
                digitoRomano = 0;
            }else{
                digitoRomano += 10;
            }


                break;

            case 'L': 

            if (caracter == 'X' && caracterSeguinte == 'L') {
                digitoRomanoemconjunto += 50;
                digitoRomano = 0;
            }else{
                digitoRomano += 50;
            }

                break;

            case 'C': 

            if (caracter == 'X' && caracterSeguinte == 'C') {
                digitoRomanoemconjunto += 90;
                digitoRomano = 0;
            }else{
                digitoRomano += 100;
            }

                break;

            case 'D': digitoRomano += 500;
                break;

            case 'M': digitoRomano += 1000;
                break;

            default: console.log("Dígito Romano Errado.");
        }



    }



    soma += digitoRomano + digitoRomanoemconjunto;

    txtResult.innerHTML = digitoRomano;
    txtResult2.innerHTML = digitoRomanoemconjunto;





}