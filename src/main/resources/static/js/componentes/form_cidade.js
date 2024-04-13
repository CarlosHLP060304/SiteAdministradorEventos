import {Input} from './input.js'

export function FormCidade(){
    return (
    Input({"id":"nome","name":"nome","label":"Nome da Cidade :","text":"nome"}) +
    Input({"id":"estado","name":"estado","label":"Estado :","text":"estado"}) +
    "<button>Adicionar Cidade</button>"
    )
}