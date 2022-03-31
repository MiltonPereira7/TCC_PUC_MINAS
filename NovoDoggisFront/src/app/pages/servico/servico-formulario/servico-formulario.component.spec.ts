import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ServicoFormularioComponent } from './servico-formulario.component';

describe('ServicoFormularioComponent', () => {
  let component: ServicoFormularioComponent;
  let fixture: ComponentFixture<ServicoFormularioComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ServicoFormularioComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ServicoFormularioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
