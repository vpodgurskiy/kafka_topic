import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DialogOrderStatusComponent } from './dialog-order-status.component';

describe('DialogOrderStatusComponent', () => {
  let component: DialogOrderStatusComponent;
  let fixture: ComponentFixture<DialogOrderStatusComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DialogOrderStatusComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DialogOrderStatusComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
