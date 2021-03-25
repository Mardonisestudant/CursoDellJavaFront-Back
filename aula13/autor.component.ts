import { Component } from '@angular/core'

@Component({
selector: 'autor',
template : `

<p>Autor</p>
<label>Nome :  {{nomeAutor}}</label>
<br >
<label>Data Nascimento : {{dataNascimento}}</label>
`
})


export class AutorComponent {
    nomeAutor: string;
    dataNascimento: number;

    constructor(){
        this.nomeAutor = ' Lilly e Lana Wachowski';
        this.dataNascimento = 1967;
    }
}
