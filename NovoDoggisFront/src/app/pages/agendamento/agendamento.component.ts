import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-agendamento',
  templateUrl: './agendamento.component.html',
  styleUrls: ['./agendamento.component.css']
})
export class AgendamentoComponent implements OnInit {

  agendamentoArray : any;

  constructor(private router: Router) {
    this.agendamentoArray = [
      {
        servico: "Banho e tosa",
        tipoProfissional: "Atendente",
        nomeProfissional: "Roberto",
        cliente: "Carlos Emanuel",
        tipoDePet: "Cachorro",
        dataHoraInicio: "25/05/2022 12:00:00",
        dataHoraFim: "25/05/2022 14:00:00"
      },
      {
        servico: "Aplicação de Vacina anti-rábica",
        tipoProfissional: "Veterinário",
        nomeProfissional: "Adriano",
        cliente: "Vanessa Ribeiro",
        tipoDePet: "Cachorro",
        dataHoraInicio: "25/05/2022 16:00:00",
        dataHoraFim: "25/05/2022 17:00:00"
      },
      {
        servico: "Radiografia",
        tipoProfissional: "Veterinário",
        nomeProfissional: "Adriano",
        cliente: "Luciano Santos",
        tipoDePet: "Gato",
        dataHoraInicio: "17/05/2022 13:00:00",
        dataHoraFim: "17/05/2022 14:00:00"
      },
      {
        servico: "Hospedagem",
        tipoProfissional: "Atendente",
        nomeProfissional: "Carla",
        cliente: "Jua Roman",
        tipoDePet: "Gato",
        dataHoraInicio: "17/05/2022 16:00:00",
        dataHoraFim: "17/05/2022 20:00:00"
      },
      {
        servico: "Spa",
        tipoProfissional: "Atendente",
        nomeProfissional: "Bruna",
        cliente: "Sandra Rizzo",
        tipoDePet: "Cachorro",
        dataHoraInicio: "18/05/2022 08:00:00",
        dataHoraFim: "18/05/2022 13:00:00"
      },
    ]
  }

  ngOnInit(): void {
  }

  cadastrar(){
    this.router.navigate(['/agendamento-formulario']);
  }

}
