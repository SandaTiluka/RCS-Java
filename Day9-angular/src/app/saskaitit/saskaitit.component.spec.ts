import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SaskaititComponent } from './saskaitit.component';

describe('SaskaititComponent', () => {
  let component: SaskaititComponent;
  let fixture: ComponentFixture<SaskaititComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SaskaititComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(SaskaititComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
