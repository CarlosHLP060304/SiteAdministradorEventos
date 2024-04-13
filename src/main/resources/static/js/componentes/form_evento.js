import { Input } from "./input.js";

export function FormEvento(){
    return(
    Input({"id":"nome","name":"nome","label":"Nome do Evento :","text":"nome"}) +
    Input({"id":"data","name":"data","label":"Data do Evento :","text":"data"}) +
    Input({"id":"url","name":"url","label":"Url para acessar Evento :","text":"url"})+
    "<button>Adicionar Evento</button>"
    )
}
