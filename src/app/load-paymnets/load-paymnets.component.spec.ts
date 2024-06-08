import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LoadPaymnetsComponent } from './load-paymnets.component';

describe('LoadPaymnetsComponent', () => {
  let component: LoadPaymnetsComponent;
  let fixture: ComponentFixture<LoadPaymnetsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [LoadPaymnetsComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(LoadPaymnetsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
