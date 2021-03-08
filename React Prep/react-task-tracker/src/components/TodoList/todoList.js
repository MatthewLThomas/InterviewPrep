import {React} from "react";
import {Todo} from "../Todo/todo";
import {useSelector} from "react-redux";


export const TodoList = () => {

    const todos = useSelector(state => state.todos)

    return(
        <>
        {console.log(todos)}
        <ul>
           {todos.map((todo, index)=>{
               return <li key = {index}><Todo todo = {todo}/></li>
           })}
        </ul>
        </>
    )
}