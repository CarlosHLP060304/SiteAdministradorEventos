import { Header } from "./componentes/header.js";

document.querySelector("header").innerHTML =
 Header({
"link_home":"/",
"link_novo_evento":"/evento/cadastrar",
"link_listar_eventos":"/evento/listar",
"link_nova_cidade":"/cidade/cadastrar",
"link_listar_cidades":"/cidade/listar"
})

