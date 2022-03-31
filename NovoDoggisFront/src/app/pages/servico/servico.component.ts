import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-servico',
  templateUrl: './servico.component.html',
  styleUrls: ['./servico.component.css']
})
export class ServicoComponent implements OnInit {

  servicosArray : any;

  constructor(private router: Router) {
    this.servicosArray = [
      {
        nome: "Banho e tosa",
        preco: "R$ 100,00",
        tempoEstimado: "2 horas",
        produtosUtilizados: "Shampoo e Condicionador",
        tipoProfissional: "Atendente",
        qtdPatazGanho: "100",
        qtdPatazNecessario: "1.000"
      },
      {
        nome: "Aplicação de Vacina anti-rábica",
        preco: "R$ 70,00",
        tempoEstimado: "1 hora",
        produtosUtilizados: "Seringa e medicação",
        tipoProfissional: "Veterinário",
        qtdPatazGanho: "70",
        qtdPatazNecessario: "700"
      },
      {
        nome: "Radiografia",
        preco: "R$ 150,00",
        tempoEstimado: "1 hora",
        produtosUtilizados: "Aplicação de calmante se necessário",
        tipoProfissional: "Veterinário",
        qtdPatazGanho: "150",
        qtdPatazNecessario: "1500"
      },
      {
        nome: "Hospedagem",
        preco: "R$ 250,00",
        tempoEstimado: "4 horas",
        produtosUtilizados: "",
        tipoProfissional: "Atendente",
        qtdPatazGanho: "250",
        qtdPatazNecessario: "2500"
      },
      {
        nome: "Spa",
        preco: "R$ 400,00",
        tempoEstimado: "5 horas",
        produtosUtilizados: "",
        tipoProfissional: "Atendente",
        qtdPatazGanho: "400",
        qtdPatazNecessario: "4000"
      },
    ]
  }

  ngOnInit(): void {
  }

  cadastrar(){
    this.router.navigate(['/servico-formulario']);
  }

}
