import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-agendamento-formulario',
  templateUrl: './agendamento-formulario.component.html',
  styleUrls: ['./agendamento-formulario.component.css']
})
export class AgendamentoFormularioComponent implements OnInit {

  constructor() { }

  servicoSelected: number;
  atendenteSelected: number;
  veterinarioSelected: number;
  clienteSelected: number;
  petSelected: number;

  servicos = [
      { id: 1, name: 'Banho e tosa' },
      { id: 2, name: 'Aplicação de Vacina anti-rábica' },
      { id: 3, name: 'Radiografia' },
      { id: 4, name: 'Hospedagem' },
      { id: 5, name: 'Spa' }
  ];

  atendentes = [
    { id: 1, name: 'Roberto' },
    { id: 2, name: 'Carla' },
    { id: 3, name: 'Bruna' }
  ];

  veterinarios = [
    { id: 1, name: 'Adriano' },
    { id: 2, name: 'Rafael' },
    { id: 3, name: 'Claiton' }
  ];

  clientes = [
    { id: 1, name: 'Carlos Emanuel' },
    { id: 2, name: 'Vanessa Ribeiro' },
    { id: 3, name: 'Luciano Santos' }
  ];

  pets = [
    { id: 1, name: 'Lunna' },
    { id: 2, name: 'Hanna' },
    { id: 3, name: 'Boby' }
  ];

  ngOnInit(): void {
  }

}
