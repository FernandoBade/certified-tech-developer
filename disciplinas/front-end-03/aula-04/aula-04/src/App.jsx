import Button from './Button';
import Title from './Title';

function App() {

function btnClick1(){
  alert('Click Btn1')
}
function btnClick2(){
  alert('Click Btn2')
}
function btnClick3(){
  alert('Click Btn3')
}
function btnClick4(){
  alert('Click Btn4')
}

  return (
  <>
  <Title text="Hello World 1"/>
  <Title text="Hello World 2"/>
  <Title/>
  <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Ex sint, quia nulla molestiae commodi odio fugiat assumenda quod necessitatibus animi eos? Illum nobis accusantium reiciendis, suscipit ab consequuntur iusto velit.</p>
  <Button name="Pressione" color='salmon' click={btnClick1}/>
  <Button name="Pressione" color='lightblue'click={btnClick2}/>
  <Button name="Pressione" color='lightgreen'click={btnClick3}/>
  <Button name="Pressione" color='beige'click={btnClick4}/>
  
  </>
  )
}

export default App
