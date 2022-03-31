import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

declare interface RouteInfo {
    path: string;
    title: string;
    icon: string;
    class: string;
}
export const ROUTES: RouteInfo[] = [
    { path: '/dashboard', title: 'Home',  icon: 'ni-tv-2 text-primary', class: '' },
    { path: '/agendamento', title: 'Agendamento',  icon:'ni ni-calendar-grid-58 text-blue', class: '' },
    { path: '/servico', title: 'Serviço',  icon:'ni-pin-3 text-orange', class: '' },
    { path: '/produto', title: 'Produto',  icon:'ni ni-box-2 text-red', class: '' },
    { path: '/tables', title: 'Cliente',  icon:'ni-single-02 text-yellow', class: '' },
    { path: '', title: 'Pet',  icon:'ni ni-favourite-28 text-info', class: '' },
    { path: '', title: 'Venda',  icon:'ni ni-cart text-black', class: '' },
    { path: '', title: 'Veterinário',  icon:'ni-circle-08 text-pink', class: '' },
    { path: '', title: 'Usuário',  icon:'ni-circle-08 text-pink', class: '' },
    { path: '/login', title: 'Login',  icon:'ni-key-25 text-info', class: 'invisible' },
    { path: '/produto-formulario', title: 'Produto Formulário',  icon:'ni-key-25 text-info', class: 'invisible' },
    { path: '/servico-formulario', title: 'Serviço Formulário',  icon:'ni-key-25 text-info', class: 'invisible' },
    { path: '/agendamento-formulario', title: 'Agendamento Formulário',  icon:'ni-key-25 text-info', class: 'invisible' }
];

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.scss']
})
export class SidebarComponent implements OnInit {

  public menuItems: any[];
  public isCollapsed = true;

  constructor(private router: Router) { }

  ngOnInit() {
    this.menuItems = ROUTES.filter(menuItem => menuItem);
    this.router.events.subscribe((event) => {
      this.isCollapsed = true;
   });
  }
}
