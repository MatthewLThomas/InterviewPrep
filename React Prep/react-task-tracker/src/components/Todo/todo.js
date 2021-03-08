import {React} from 'react';

export const Todo = (props) => {

    return(
        <div className = "container">
          
            <h4>{props.todo.todoName}</h4>
        </div>
    );
} 