import { ComponentFixture, TestBed } from '@angular/core/testing';

import { IevadsComponent } from './ievads.component';

describe('IevadsComponent', () => {
  let component: IevadsComponent;
  let fixture: ComponentFixture<IevadsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [IevadsComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(IevadsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
