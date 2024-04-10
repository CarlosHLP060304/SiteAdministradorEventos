import { Input } from "./componentes/input.js";

document.querySelector("#form_adiciona_evento").innerHTML = 

Input({"id":"nome","name":"nome","label":"Nome do Evento :","text":"nome"}) +
Input({"id":"data","name":"data","label":"Data do Evento :","text":"data"}) +
Input({"id":"url","name":"url","label":"Url para acessar Evento :","text":"url"}) +

"<button>Adicionar Evento</button>"