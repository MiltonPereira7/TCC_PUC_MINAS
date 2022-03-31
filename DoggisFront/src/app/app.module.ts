import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { AdminLayoutComponent } from './layouts/admin-layout/admin-layout.component';
import { AuthLayoutComponent } from './layouts/auth-layout/auth-layout.component';

import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

import { AppRoutingModule } from './app.routing';
import { ComponentsModule } from './components/components.module';
import { ProdutoComponent } from './pages/produto/produto.component';
import { ServicoComponent } from './pages/servico/servico.component';
import { AgendamentoComponent } from './pages/agendamento/agendamento.component';
import { ProdutoFormularioComponent } from './pages/produto/produto-formulario/produto-formulario.component';
import { ServicoFormularioComponent } from './pages/servico/servico-formulario/servico-formulario.component';
import { AgendamentoFormularioComponent } from './pages/agendamento/agendamento-formulario/agendamento-formulario.component';
import { NgSelectModule } from '@ng-select/ng-select';


@NgModule({
  imports: [
    BrowserAnimationsModule,
    FormsModule,
    HttpClientModule,
    ComponentsModule,
    NgbModule,
    RouterModule,
    AppRoutingModule,
    NgSelectModule
  ],
  declarations: [
    AppComponent,
    AdminLayoutComponent,
    AuthLayoutComponent,
    ProdutoComponent,
    ServicoComponent,
    AgendamentoComponent,
    ProdutoFormularioComponent,
    ServicoFormularioComponent,
    AgendamentoFormularioComponent
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
