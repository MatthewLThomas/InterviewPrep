import React from 'react'
import Tippy from '@tippyjs/react'


const Header = () => {

    return (
        <div>
            <header className = "border">
                <Tippy content="Goodbye">
                     <button>My button</button>
                </Tippy>
            </header>
        </div>
    )
}

export default Header
