import {Input} from './componentes/input.js'

document.querySelector("#form_adiciona_cidade").innerHTML =

Input({"id":"nome","name":"nome","label":"Nome da Cidade :","text":"nome"}) +
Input({"id":"estado","name":"estado","label":"Estado :","text":"estado"}) +

"<button>Adicionar Cidade</button>"