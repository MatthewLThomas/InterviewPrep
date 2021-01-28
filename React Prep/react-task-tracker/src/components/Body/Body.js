import{ React, useState} from 'react'
import axios from 'axios'
import Tippy from '@tippyjs/react'
import "./Body.css"


const Body = () => { 

    const [inputState, setInputState] = useState('')
    const [errorMessage, seterrorMessage] = useState('')
    let error

    const updateState = (event) => {
        setInputState(event.target.value);
        console.log(inputState)
    }
  
    const handleSubmit = (event) => {
        const val = +event.target[0].value;
        const transmit = {
            value: val
        }
        if(val > 0 && val < 11){
            seterrorMessage("");
            axios.post("http://localhost:8080/api/example/form",transmit).then(res =>{console.log(res)}) 
            console.log ("test")
        }
        if(!val){
            seterrorMessage("must enter a number between 0 and 10")
        }
        event.preventDefault();
    }

    const displayError = () =>{
        return (
            <p>{errorMessage}</p>
        );
    }
    if(errorMessage === ""){
        error = "";
    }
    if(errorMessage != ""){
        error = displayError();
    }

    return (
        <div className = "border container">
            <div className = "row d-flex align-items-center"><img className = "smallLogo col-3"  src = {process.env.PUBLIC_URL + "/2913.png"}/><h1 className = "text-center align-middle col-3">Steve</h1> <img className = "smallLogo col-3"  src = {process.env.PUBLIC_URL + "/2913.png"}/></div>
            <form onSubmit = {(event) => {handleSubmit(event)}}> 
                <Tippy content = "Enter a number between 1 and 10">
                    <input type = "text" value={inputState}onChange ={(event) => {updateState(event)}} placeholder = "input"/>
                </Tippy>
                <input type = "submit"></input>
            </form>
            {error}
        </div>
    )
}

export default Body
