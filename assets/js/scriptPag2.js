const nome = document.getElementById("nome");
const nick = document.getElementById("nick");
const data = document.getElementById("data");
const profissao = document.getElementById("profissao");
const escolaridade = document.getElementById("escolaridade");
const bio = document.getElementById("bio");



function cadastrar() {
   fetch("http://localhost:8080/clientes",
      {
         headers: {
            "Accept": "application/json",
            "Content-Type": "application/json"
         },
         method: "POST",
         body: JSON.stringify({
            nomeCompleto: nome.value,
            nick: nick.value,
            dataNascimento: data.value,
            profissao: profissao.value,
            escolaridade: escolaridade.value,
            bio: bio.value
         })
      })
      .then(function (resp) { console.log("Conexão realizada com sucesso: " + resp) })
      .catch(function (resp) { console.log("Erro ao conectar: " + resp) })

      limpar();
}

function limpar() {
   nome.value = "";
   nick.value = "";
   data.value = "";
   profissao.value = "";
   escolaridade.value = "";
   bio.value = "";

}




























