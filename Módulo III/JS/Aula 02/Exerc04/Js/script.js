function cadastraCarros(){

    let carros = new Object();

        carros.fabricante = prompt("Digite o nome do fabricante do carro: ");
        carros.modelo = prompt("Digite o modelo do veículo: ");
        carros.ano = prompt("Digite o ano de fabricação: ");
        carros.qtdPortas = prompt("Digite a quantidade de portas: ");
        carros.retornaDados = function(){

            return "Fabricante: " +this.fabricante+"<br>Modelo: "+this.modelo+"<br>Ano: "+carros.ano;

        }

    let inf = document.getElementById("carros");
    let dados = carros.retornaDados();
        inf.innerHTML = dados;




}