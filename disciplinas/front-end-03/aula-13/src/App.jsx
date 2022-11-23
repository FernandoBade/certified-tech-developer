import { useState } from 'react'

function App() {
  const [count, setCount] = useState(0)
  setCount = { count + 1 }
return (
  <>
    <h1>{count}</h1>
  </>
)
}

export default App
