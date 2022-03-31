import { Routes } from '@angular/router';

import { DashboardComponent } from '../../pages/dashboard/dashboard.component';
import { IconsComponent } from '../../pages/icons/icons.component';
import { MapsComponent } from '../../pages/maps/maps.component';
import { UserProfileComponent } from '../../pages/user-profile/user-profile.component';
import { TablesComponent } from '../../pages/tables/tables.component';
import { ProdutoComponent } from 'src/app/pages/produto/produto.component';
import { ServicoComponent } from 'src/app/pages/servico/servico.component';
import { AgendamentoComponent } from 'src/app/pages/agendamento/agendamento.component';
import { ProdutoFormularioComponent } from 'src/app/pages/produto/produto-formulario/produto-formulario.component';
import { ServicoFormularioComponent } from 'src/app/pages/servico/servico-formulario/servico-formulario.component';
import { AgendamentoFormularioComponent } from 'src/app/pages/agendamento/agendamento-formulario/agendamento-formulario.component';

export const AdminLayoutRoutes: Routes = [
    { path: 'dashboard',      component: DashboardComponent },
    { path: 'user-profile',   component: UserProfileComponent },
    { path: 'produto',       component: ProdutoComponent },
    { path: 'servico',       component: ServicoComponent },
    { path: 'agendamento',       component: AgendamentoComponent },
    { path: 'produto-formulario', component: ProdutoFormularioComponent },
    { path: 'servico-formulario', component: ServicoFormularioComponent },
    { path: 'agendamento-formulario', component: AgendamentoFormularioComponent }
];
