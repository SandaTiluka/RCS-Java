import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TitulbildeComponent } from './titulbilde.component';

describe('TitulbildeComponent', () => {
  let component: TitulbildeComponent;
  let fixture: ComponentFixture<TitulbildeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [TitulbildeComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(TitulbildeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
