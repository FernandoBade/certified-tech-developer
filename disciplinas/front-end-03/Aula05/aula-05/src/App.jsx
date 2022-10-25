import Container from './Container'

function App() {
  return (
    <>
      <h1>Hello World!</h1>
      <Container title="Título Container 1" />
      <Container title="Hello World 2" />
      <Container title="Hello World 3" />
      <Container title="Hello World 4" />
      <Container>
        <h1>Texto Children</h1>
      </Container>
    </>
  )
}

export default App;