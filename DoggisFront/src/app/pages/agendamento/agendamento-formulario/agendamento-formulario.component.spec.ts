import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AgendamentoFormularioComponent } from './agendamento-formulario.component';

describe('AgendamentoFormularioComponent', () => {
  let component: AgendamentoFormularioComponent;
  let fixture: ComponentFixture<AgendamentoFormularioComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AgendamentoFormularioComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AgendamentoFormularioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
