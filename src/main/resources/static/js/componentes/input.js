export function Input(props) {
    return(
        `
        <div class="p-2">
            <label for= ${props.id} >${props.label}</label>
            <input th:text="*{${props.text}}}" name=${props.name} id=${props.id} type="text"/>
        </div>
        `
    )
}