import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-produto',
  templateUrl: './produto.component.html',
  styleUrls: ['./produto.component.css']
})
export class ProdutoComponent implements OnInit {

  produtoArray : any;

  constructor(private router: Router) {
    this.produtoArray = [
      {
        nome: "Shampoo",
        preco: "R$ 20,00",
        quantidadeEstoque: "150",
        fabricante: "Dr. Clean",
        especificacao: "Shampoo 3 em 1",
      },
      {
        nome: "Ração Premier",
        preco: "R$ 150,00",
        quantidadeEstoque: "50",
        fabricante: "Premier",
        especificacao: "10 kilos de ração para filhote",
      },
      {
        nome: "Brinquedo arranhador",
        preco: "R$ 16,00",
        quantidadeEstoque: "125",
        fabricante: "Borrachas Pets",
        especificacao: "Brinquedo para todas as raças e tamanhos",
      },
      {
        nome: "Osso",
        preco: "R$ 23,00",
        quantidadeEstoque: "200",
        fabricante: "New Ossos fábrica",
        especificacao: "Ossos para mastigação e fortificação da mandíbula",
      },
      {
        nome: "Casa para cães preta",
        preco: "R$ 299,00",
        quantidadeEstoque: "25",
        fabricante: "Dog's House",
        especificacao: "Casa para cães de até porte médio",
      },
    ]
  }

  ngOnInit(): void {
  }

  cadastrar(){
    this.router.navigate(['/produto-formulario']);
  }

}
