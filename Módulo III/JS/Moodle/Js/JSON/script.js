let exemploJson = '{"ong":"Recode", "telefone":"22223333 "}';
let exemploConversao = JSON.parse(exemploJson);
console.log(exemploConversao);

let tipo = typeof((JSON.stringify(exemploConversao)));
console.log(tipo);
