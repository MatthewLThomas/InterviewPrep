import {React, useState} from 'react'
import {useDispatch} from 'react-redux'
import {addTodo} from '../../actions/todos'
export const NewTodo = () => {

    const [input, setInput] = useState("");
    const updateInput = (event) => {
        setInput(event.target.value);
    }
    const handleSubmit = (event) => {
        event.preventDefault();
        const toDo = {
            todoName: event.target[0].value,
            priority: false
        }
        dispatch(addTodo(toDo));
        setInput("");
        
    }
    const dispatch = useDispatch();
    return(
        <div>
            <form onSubmit = {(event) => handleSubmit(event)}>
                <input type = "text" value = {input} placeholder = "New ToDo" onChange = {(event) => {updateInput(event)}}/>
                <input type = "submit"/>
            </form>
        </div>
    )
}