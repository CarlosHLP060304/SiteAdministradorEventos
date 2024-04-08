export function Input(props) {
    return(
        `
        <div class="p-2">
            <label for= ${props.id} >${props.label}</label>
            <input name=${props.name} id=${props.id} type="text"/>
        </div>
        `
    )
}