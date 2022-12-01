// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collections;
import com.google.protobuf.Parser;
import java.util.List;
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class AllWidgetDataNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_AllWidgetDataNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AllWidgetDataNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AllWidgetDataNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AllWidgetDataNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019AllWidgetDataNotify.proto\u001a\u0015AnchorPointData.proto\u001a\u0019ClientCollectorData.proto\u001a\u0012LunchBoxData.proto\u001a\"OneofGatherPointDetectorData.proto\u001a\u0019Unk2700_CCEOEOHLAPK.proto\u001a\u0018WidgetCoolDownData.proto\u001a\u0014WidgetSlotData.proto\"\u00fd\u0003\n\u0013AllWidgetDataNotify\u0012\u001b\n\u0013Unk3000_CNNFGFBBBFP\u0018\u000b \u0003(\r\u0012%\n\u000elunch_box_data\u0018\u0001 \u0001(\u000b2\r.LunchBoxData\u00126\n\u0019cool_down_group_data_list\u0018\r \u0003(\u000b2\u0013.WidgetCoolDownData\u0012+\n\u0011anchor_point_list\u0018\u0003 \u0003(\u000b2\u0010.AnchorPointData\u0012\"\n\tslot_list\u0018\u0006 \u0003(\u000b2\u000f.WidgetSlotData\u0012%\n\u001dnext_anchor_point_usable_time\u0018\n \u0001(\r\u00128\n\u001aclient_collector_data_list\u0018\u0004 \u0003(\u000b2\u0014.ClientCollectorData\u0012L\n%oneof_gather_point_detector_data_list\u0018\u000f \u0003(\u000b2\u001d.OneofGatherPointDetectorData\u00127\n\u001anormal_cool_down_data_list\u0018\t \u0003(\u000b2\u0013.WidgetCoolDownData\u00121\n\u0013Unk2700_COIELIGEACL\u0018\f \u0001(\u000b2\u0014.Unk2700_CCEOEOHLAPKB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AllWidgetDataNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AnchorPointDataOuterClass.getDescriptor(), ClientCollectorDataOuterClass.getDescriptor(), LunchBoxDataOuterClass.getDescriptor(), OneofGatherPointDetectorDataOuterClass.getDescriptor(), Unk2700CCEOEOHLAPK.getDescriptor(), WidgetCoolDownDataOuterClass.getDescriptor(), WidgetSlotDataOuterClass.getDescriptor() });
        internal_static_AllWidgetDataNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AllWidgetDataNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AllWidgetDataNotifyOuterClass.internal_static_AllWidgetDataNotify_descriptor, new String[] { "Unk3000CNNFGFBBBFP", "LunchBoxData", "CoolDownGroupDataList", "AnchorPointList", "SlotList", "NextAnchorPointUsableTime", "ClientCollectorDataList", "OneofGatherPointDetectorDataList", "NormalCoolDownDataList", "Unk2700COIELIGEACL" });
        AnchorPointDataOuterClass.getDescriptor();
        ClientCollectorDataOuterClass.getDescriptor();
        LunchBoxDataOuterClass.getDescriptor();
        OneofGatherPointDetectorDataOuterClass.getDescriptor();
        Unk2700CCEOEOHLAPK.getDescriptor();
        WidgetCoolDownDataOuterClass.getDescriptor();
        WidgetSlotDataOuterClass.getDescriptor();
    }
    
    public static final class AllWidgetDataNotify extends GeneratedMessageV3 implements AllWidgetDataNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int UNK3000_CNNFGFBBBFP_FIELD_NUMBER = 11;
        private Internal.IntList unk3000CNNFGFBBBFP_;
        private int unk3000CNNFGFBBBFPMemoizedSerializedSize;
        public static final int LUNCH_BOX_DATA_FIELD_NUMBER = 1;
        private LunchBoxDataOuterClass.LunchBoxData lunchBoxData_;
        public static final int COOL_DOWN_GROUP_DATA_LIST_FIELD_NUMBER = 13;
        private List<WidgetCoolDownDataOuterClass.WidgetCoolDownData> coolDownGroupDataList_;
        public static final int ANCHOR_POINT_LIST_FIELD_NUMBER = 3;
        private List<AnchorPointDataOuterClass.AnchorPointData> anchorPointList_;
        public static final int SLOT_LIST_FIELD_NUMBER = 6;
        private List<WidgetSlotDataOuterClass.WidgetSlotData> slotList_;
        public static final int NEXT_ANCHOR_POINT_USABLE_TIME_FIELD_NUMBER = 10;
        private int nextAnchorPointUsableTime_;
        public static final int CLIENT_COLLECTOR_DATA_LIST_FIELD_NUMBER = 4;
        private List<ClientCollectorDataOuterClass.ClientCollectorData> clientCollectorDataList_;
        public static final int ONEOF_GATHER_POINT_DETECTOR_DATA_LIST_FIELD_NUMBER = 15;
        private List<OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData> oneofGatherPointDetectorDataList_;
        public static final int NORMAL_COOL_DOWN_DATA_LIST_FIELD_NUMBER = 9;
        private List<WidgetCoolDownDataOuterClass.WidgetCoolDownData> normalCoolDownDataList_;
        public static final int UNK2700_COIELIGEACL_FIELD_NUMBER = 12;
        private Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK unk2700COIELIGEACL_;
        private byte memoizedIsInitialized;
        private static final AllWidgetDataNotify DEFAULT_INSTANCE;
        private static final Parser<AllWidgetDataNotify> PARSER;
        
        private AllWidgetDataNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.unk3000CNNFGFBBBFPMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private AllWidgetDataNotify() {
            this.unk3000CNNFGFBBBFPMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.unk3000CNNFGFBBBFP_ = GeneratedMessageV3.emptyIntList();
            this.coolDownGroupDataList_ = Collections.emptyList();
            this.anchorPointList_ = Collections.emptyList();
            this.slotList_ = Collections.emptyList();
            this.clientCollectorDataList_ = Collections.emptyList();
            this.oneofGatherPointDetectorDataList_ = Collections.emptyList();
            this.normalCoolDownDataList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AllWidgetDataNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AllWidgetDataNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            int mutable_bitField0_ = 0;
            final UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    final int tag = input.readTag();
                    switch (tag) {
                        case 0: {
                            done = true;
                            continue;
                        }
                        case 10: {
                            LunchBoxDataOuterClass.LunchBoxData.Builder subBuilder = null;
                            if (this.lunchBoxData_ != null) {
                                subBuilder = this.lunchBoxData_.toBuilder();
                            }
                            this.lunchBoxData_ = input.readMessage(LunchBoxDataOuterClass.LunchBoxData.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.lunchBoxData_);
                                this.lunchBoxData_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 26: {
                            if ((mutable_bitField0_ & 0x4) == 0x0) {
                                this.anchorPointList_ = new ArrayList<AnchorPointDataOuterClass.AnchorPointData>();
                                mutable_bitField0_ |= 0x4;
                            }
                            this.anchorPointList_.add(input.readMessage(AnchorPointDataOuterClass.AnchorPointData.parser(), extensionRegistry));
                            continue;
                        }
                        case 34: {
                            if ((mutable_bitField0_ & 0x10) == 0x0) {
                                this.clientCollectorDataList_ = new ArrayList<ClientCollectorDataOuterClass.ClientCollectorData>();
                                mutable_bitField0_ |= 0x10;
                            }
                            this.clientCollectorDataList_.add(input.readMessage(ClientCollectorDataOuterClass.ClientCollectorData.parser(), extensionRegistry));
                            continue;
                        }
                        case 50: {
                            if ((mutable_bitField0_ & 0x8) == 0x0) {
                                this.slotList_ = new ArrayList<WidgetSlotDataOuterClass.WidgetSlotData>();
                                mutable_bitField0_ |= 0x8;
                            }
                            this.slotList_.add(input.readMessage(WidgetSlotDataOuterClass.WidgetSlotData.parser(), extensionRegistry));
                            continue;
                        }
                        case 74: {
                            if ((mutable_bitField0_ & 0x40) == 0x0) {
                                this.normalCoolDownDataList_ = new ArrayList<WidgetCoolDownDataOuterClass.WidgetCoolDownData>();
                                mutable_bitField0_ |= 0x40;
                            }
                            this.normalCoolDownDataList_.add(input.readMessage(WidgetCoolDownDataOuterClass.WidgetCoolDownData.parser(), extensionRegistry));
                            continue;
                        }
                        case 80: {
                            this.nextAnchorPointUsableTime_ = input.readUInt32();
                            continue;
                        }
                        case 88: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.unk3000CNNFGFBBBFP_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.unk3000CNNFGFBBBFP_.addInt(input.readUInt32());
                            continue;
                        }
                        case 90: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.unk3000CNNFGFBBBFP_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.unk3000CNNFGFBBBFP_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 98: {
                            Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK.Builder subBuilder2 = null;
                            if (this.unk2700COIELIGEACL_ != null) {
                                subBuilder2 = this.unk2700COIELIGEACL_.toBuilder();
                            }
                            this.unk2700COIELIGEACL_ = input.readMessage(Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK.parser(), extensionRegistry);
                            if (subBuilder2 != null) {
                                subBuilder2.mergeFrom(this.unk2700COIELIGEACL_);
                                this.unk2700COIELIGEACL_ = subBuilder2.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 106: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.coolDownGroupDataList_ = new ArrayList<WidgetCoolDownDataOuterClass.WidgetCoolDownData>();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.coolDownGroupDataList_.add(input.readMessage(WidgetCoolDownDataOuterClass.WidgetCoolDownData.parser(), extensionRegistry));
                            continue;
                        }
                        case 122: {
                            if ((mutable_bitField0_ & 0x20) == 0x0) {
                                this.oneofGatherPointDetectorDataList_ = new ArrayList<OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData>();
                                mutable_bitField0_ |= 0x20;
                            }
                            this.oneofGatherPointDetectorDataList_.add(input.readMessage(OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.parser(), extensionRegistry));
                            continue;
                        }
                        default: {
                            if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                                continue;
                            }
                            continue;
                        }
                    }
                }
            }
            catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            }
            catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
            }
            finally {
                if ((mutable_bitField0_ & 0x4) != 0x0) {
                    this.anchorPointList_ = Collections.unmodifiableList((List<? extends AnchorPointDataOuterClass.AnchorPointData>)this.anchorPointList_);
                }
                if ((mutable_bitField0_ & 0x10) != 0x0) {
                    this.clientCollectorDataList_ = Collections.unmodifiableList((List<? extends ClientCollectorDataOuterClass.ClientCollectorData>)this.clientCollectorDataList_);
                }
                if ((mutable_bitField0_ & 0x8) != 0x0) {
                    this.slotList_ = Collections.unmodifiableList((List<? extends WidgetSlotDataOuterClass.WidgetSlotData>)this.slotList_);
                }
                if ((mutable_bitField0_ & 0x40) != 0x0) {
                    this.normalCoolDownDataList_ = Collections.unmodifiableList((List<? extends WidgetCoolDownDataOuterClass.WidgetCoolDownData>)this.normalCoolDownDataList_);
                }
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.unk3000CNNFGFBBBFP_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.coolDownGroupDataList_ = Collections.unmodifiableList((List<? extends WidgetCoolDownDataOuterClass.WidgetCoolDownData>)this.coolDownGroupDataList_);
                }
                if ((mutable_bitField0_ & 0x20) != 0x0) {
                    this.oneofGatherPointDetectorDataList_ = Collections.unmodifiableList((List<? extends OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData>)this.oneofGatherPointDetectorDataList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return AllWidgetDataNotifyOuterClass.internal_static_AllWidgetDataNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AllWidgetDataNotifyOuterClass.internal_static_AllWidgetDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(AllWidgetDataNotify.class, Builder.class);
        }
        
        @Override
        public List<Integer> getUnk3000CNNFGFBBBFPList() {
            return this.unk3000CNNFGFBBBFP_;
        }
        
        @Override
        public int getUnk3000CNNFGFBBBFPCount() {
            return this.unk3000CNNFGFBBBFP_.size();
        }
        
        @Override
        public int getUnk3000CNNFGFBBBFP(final int index) {
            return this.unk3000CNNFGFBBBFP_.getInt(index);
        }
        
        @Override
        public boolean hasLunchBoxData() {
            return this.lunchBoxData_ != null;
        }
        
        @Override
        public LunchBoxDataOuterClass.LunchBoxData getLunchBoxData() {
            return (this.lunchBoxData_ == null) ? LunchBoxDataOuterClass.LunchBoxData.getDefaultInstance() : this.lunchBoxData_;
        }
        
        @Override
        public LunchBoxDataOuterClass.LunchBoxDataOrBuilder getLunchBoxDataOrBuilder() {
            return this.getLunchBoxData();
        }
        
        @Override
        public List<WidgetCoolDownDataOuterClass.WidgetCoolDownData> getCoolDownGroupDataListList() {
            return this.coolDownGroupDataList_;
        }
        
        @Override
        public List<? extends WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder> getCoolDownGroupDataListOrBuilderList() {
            return this.coolDownGroupDataList_;
        }
        
        @Override
        public int getCoolDownGroupDataListCount() {
            return this.coolDownGroupDataList_.size();
        }
        
        @Override
        public WidgetCoolDownDataOuterClass.WidgetCoolDownData getCoolDownGroupDataList(final int index) {
            return this.coolDownGroupDataList_.get(index);
        }
        
        @Override
        public WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder getCoolDownGroupDataListOrBuilder(final int index) {
            return this.coolDownGroupDataList_.get(index);
        }
        
        @Override
        public List<AnchorPointDataOuterClass.AnchorPointData> getAnchorPointListList() {
            return this.anchorPointList_;
        }
        
        @Override
        public List<? extends AnchorPointDataOuterClass.AnchorPointDataOrBuilder> getAnchorPointListOrBuilderList() {
            return this.anchorPointList_;
        }
        
        @Override
        public int getAnchorPointListCount() {
            return this.anchorPointList_.size();
        }
        
        @Override
        public AnchorPointDataOuterClass.AnchorPointData getAnchorPointList(final int index) {
            return this.anchorPointList_.get(index);
        }
        
        @Override
        public AnchorPointDataOuterClass.AnchorPointDataOrBuilder getAnchorPointListOrBuilder(final int index) {
            return this.anchorPointList_.get(index);
        }
        
        @Override
        public List<WidgetSlotDataOuterClass.WidgetSlotData> getSlotListList() {
            return this.slotList_;
        }
        
        @Override
        public List<? extends WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> getSlotListOrBuilderList() {
            return this.slotList_;
        }
        
        @Override
        public int getSlotListCount() {
            return this.slotList_.size();
        }
        
        @Override
        public WidgetSlotDataOuterClass.WidgetSlotData getSlotList(final int index) {
            return this.slotList_.get(index);
        }
        
        @Override
        public WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder getSlotListOrBuilder(final int index) {
            return this.slotList_.get(index);
        }
        
        @Override
        public int getNextAnchorPointUsableTime() {
            return this.nextAnchorPointUsableTime_;
        }
        
        @Override
        public List<ClientCollectorDataOuterClass.ClientCollectorData> getClientCollectorDataListList() {
            return this.clientCollectorDataList_;
        }
        
        @Override
        public List<? extends ClientCollectorDataOuterClass.ClientCollectorDataOrBuilder> getClientCollectorDataListOrBuilderList() {
            return this.clientCollectorDataList_;
        }
        
        @Override
        public int getClientCollectorDataListCount() {
            return this.clientCollectorDataList_.size();
        }
        
        @Override
        public ClientCollectorDataOuterClass.ClientCollectorData getClientCollectorDataList(final int index) {
            return this.clientCollectorDataList_.get(index);
        }
        
        @Override
        public ClientCollectorDataOuterClass.ClientCollectorDataOrBuilder getClientCollectorDataListOrBuilder(final int index) {
            return this.clientCollectorDataList_.get(index);
        }
        
        @Override
        public List<OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData> getOneofGatherPointDetectorDataListList() {
            return this.oneofGatherPointDetectorDataList_;
        }
        
        @Override
        public List<? extends OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorDataOrBuilder> getOneofGatherPointDetectorDataListOrBuilderList() {
            return this.oneofGatherPointDetectorDataList_;
        }
        
        @Override
        public int getOneofGatherPointDetectorDataListCount() {
            return this.oneofGatherPointDetectorDataList_.size();
        }
        
        @Override
        public OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData getOneofGatherPointDetectorDataList(final int index) {
            return this.oneofGatherPointDetectorDataList_.get(index);
        }
        
        @Override
        public OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorDataOrBuilder getOneofGatherPointDetectorDataListOrBuilder(final int index) {
            return this.oneofGatherPointDetectorDataList_.get(index);
        }
        
        @Override
        public List<WidgetCoolDownDataOuterClass.WidgetCoolDownData> getNormalCoolDownDataListList() {
            return this.normalCoolDownDataList_;
        }
        
        @Override
        public List<? extends WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder> getNormalCoolDownDataListOrBuilderList() {
            return this.normalCoolDownDataList_;
        }
        
        @Override
        public int getNormalCoolDownDataListCount() {
            return this.normalCoolDownDataList_.size();
        }
        
        @Override
        public WidgetCoolDownDataOuterClass.WidgetCoolDownData getNormalCoolDownDataList(final int index) {
            return this.normalCoolDownDataList_.get(index);
        }
        
        @Override
        public WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder getNormalCoolDownDataListOrBuilder(final int index) {
            return this.normalCoolDownDataList_.get(index);
        }
        
        @Override
        public boolean hasUnk2700COIELIGEACL() {
            return this.unk2700COIELIGEACL_ != null;
        }
        
        @Override
        public Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK getUnk2700COIELIGEACL() {
            return (this.unk2700COIELIGEACL_ == null) ? Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK.getDefaultInstance() : this.unk2700COIELIGEACL_;
        }
        
        @Override
        public Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPKOrBuilder getUnk2700COIELIGEACLOrBuilder() {
            return this.getUnk2700COIELIGEACL();
        }
        
        @Override
        public final boolean isInitialized() {
            final byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }
        
        @Override
        public void writeTo(final CodedOutputStream output) throws IOException {
            this.getSerializedSize();
            if (this.lunchBoxData_ != null) {
                output.writeMessage(1, this.getLunchBoxData());
            }
            for (int i = 0; i < this.anchorPointList_.size(); ++i) {
                output.writeMessage(3, this.anchorPointList_.get(i));
            }
            for (int i = 0; i < this.clientCollectorDataList_.size(); ++i) {
                output.writeMessage(4, this.clientCollectorDataList_.get(i));
            }
            for (int i = 0; i < this.slotList_.size(); ++i) {
                output.writeMessage(6, this.slotList_.get(i));
            }
            for (int i = 0; i < this.normalCoolDownDataList_.size(); ++i) {
                output.writeMessage(9, this.normalCoolDownDataList_.get(i));
            }
            if (this.nextAnchorPointUsableTime_ != 0) {
                output.writeUInt32(10, this.nextAnchorPointUsableTime_);
            }
            if (this.getUnk3000CNNFGFBBBFPList().size() > 0) {
                output.writeUInt32NoTag(90);
                output.writeUInt32NoTag(this.unk3000CNNFGFBBBFPMemoizedSerializedSize);
            }
            for (int i = 0; i < this.unk3000CNNFGFBBBFP_.size(); ++i) {
                output.writeUInt32NoTag(this.unk3000CNNFGFBBBFP_.getInt(i));
            }
            if (this.unk2700COIELIGEACL_ != null) {
                output.writeMessage(12, this.getUnk2700COIELIGEACL());
            }
            for (int i = 0; i < this.coolDownGroupDataList_.size(); ++i) {
                output.writeMessage(13, this.coolDownGroupDataList_.get(i));
            }
            for (int i = 0; i < this.oneofGatherPointDetectorDataList_.size(); ++i) {
                output.writeMessage(15, this.oneofGatherPointDetectorDataList_.get(i));
            }
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if (this.lunchBoxData_ != null) {
                size += CodedOutputStream.computeMessageSize(1, this.getLunchBoxData());
            }
            for (int i = 0; i < this.anchorPointList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(3, this.anchorPointList_.get(i));
            }
            for (int i = 0; i < this.clientCollectorDataList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(4, this.clientCollectorDataList_.get(i));
            }
            for (int i = 0; i < this.slotList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(6, this.slotList_.get(i));
            }
            for (int i = 0; i < this.normalCoolDownDataList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(9, this.normalCoolDownDataList_.get(i));
            }
            if (this.nextAnchorPointUsableTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.nextAnchorPointUsableTime_);
            }
            int dataSize = 0;
            for (int j = 0; j < this.unk3000CNNFGFBBBFP_.size(); ++j) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.unk3000CNNFGFBBBFP_.getInt(j));
            }
            size += dataSize;
            if (!this.getUnk3000CNNFGFBBBFPList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.unk3000CNNFGFBBBFPMemoizedSerializedSize = dataSize;
            if (this.unk2700COIELIGEACL_ != null) {
                size += CodedOutputStream.computeMessageSize(12, this.getUnk2700COIELIGEACL());
            }
            for (int i = 0; i < this.coolDownGroupDataList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(13, this.coolDownGroupDataList_.get(i));
            }
            for (int i = 0; i < this.oneofGatherPointDetectorDataList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(15, this.oneofGatherPointDetectorDataList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AllWidgetDataNotify)) {
                return super.equals(obj);
            }
            final AllWidgetDataNotify other = (AllWidgetDataNotify)obj;
            return this.getUnk3000CNNFGFBBBFPList().equals(other.getUnk3000CNNFGFBBBFPList()) && this.hasLunchBoxData() == other.hasLunchBoxData() && (!this.hasLunchBoxData() || this.getLunchBoxData().equals(other.getLunchBoxData())) && this.getCoolDownGroupDataListList().equals(other.getCoolDownGroupDataListList()) && this.getAnchorPointListList().equals(other.getAnchorPointListList()) && this.getSlotListList().equals(other.getSlotListList()) && this.getNextAnchorPointUsableTime() == other.getNextAnchorPointUsableTime() && this.getClientCollectorDataListList().equals(other.getClientCollectorDataListList()) && this.getOneofGatherPointDetectorDataListList().equals(other.getOneofGatherPointDetectorDataListList()) && this.getNormalCoolDownDataListList().equals(other.getNormalCoolDownDataListList()) && this.hasUnk2700COIELIGEACL() == other.hasUnk2700COIELIGEACL() && (!this.hasUnk2700COIELIGEACL() || this.getUnk2700COIELIGEACL().equals(other.getUnk2700COIELIGEACL())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getUnk3000CNNFGFBBBFPCount() > 0) {
                hash = 37 * hash + 11;
                hash = 53 * hash + this.getUnk3000CNNFGFBBBFPList().hashCode();
            }
            if (this.hasLunchBoxData()) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getLunchBoxData().hashCode();
            }
            if (this.getCoolDownGroupDataListCount() > 0) {
                hash = 37 * hash + 13;
                hash = 53 * hash + this.getCoolDownGroupDataListList().hashCode();
            }
            if (this.getAnchorPointListCount() > 0) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getAnchorPointListList().hashCode();
            }
            if (this.getSlotListCount() > 0) {
                hash = 37 * hash + 6;
                hash = 53 * hash + this.getSlotListList().hashCode();
            }
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getNextAnchorPointUsableTime();
            if (this.getClientCollectorDataListCount() > 0) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.getClientCollectorDataListList().hashCode();
            }
            if (this.getOneofGatherPointDetectorDataListCount() > 0) {
                hash = 37 * hash + 15;
                hash = 53 * hash + this.getOneofGatherPointDetectorDataListList().hashCode();
            }
            if (this.getNormalCoolDownDataListCount() > 0) {
                hash = 37 * hash + 9;
                hash = 53 * hash + this.getNormalCoolDownDataListList().hashCode();
            }
            if (this.hasUnk2700COIELIGEACL()) {
                hash = 37 * hash + 12;
                hash = 53 * hash + this.getUnk2700COIELIGEACL().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AllWidgetDataNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AllWidgetDataNotify.PARSER.parseFrom(data);
        }
        
        public static AllWidgetDataNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AllWidgetDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AllWidgetDataNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AllWidgetDataNotify.PARSER.parseFrom(data);
        }
        
        public static AllWidgetDataNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AllWidgetDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AllWidgetDataNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AllWidgetDataNotify.PARSER.parseFrom(data);
        }
        
        public static AllWidgetDataNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AllWidgetDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AllWidgetDataNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AllWidgetDataNotify.PARSER, input);
        }
        
        public static AllWidgetDataNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AllWidgetDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static AllWidgetDataNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AllWidgetDataNotify.PARSER, input);
        }
        
        public static AllWidgetDataNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AllWidgetDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static AllWidgetDataNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AllWidgetDataNotify.PARSER, input);
        }
        
        public static AllWidgetDataNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AllWidgetDataNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AllWidgetDataNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AllWidgetDataNotify prototype) {
            return AllWidgetDataNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AllWidgetDataNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AllWidgetDataNotify getDefaultInstance() {
            return AllWidgetDataNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<AllWidgetDataNotify> parser() {
            return AllWidgetDataNotify.PARSER;
        }
        
        @Override
        public Parser<AllWidgetDataNotify> getParserForType() {
            return AllWidgetDataNotify.PARSER;
        }
        
        @Override
        public AllWidgetDataNotify getDefaultInstanceForType() {
            return AllWidgetDataNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AllWidgetDataNotify();
            PARSER = new AbstractParser<AllWidgetDataNotify>() {
                @Override
                public AllWidgetDataNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AllWidgetDataNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AllWidgetDataNotifyOrBuilder
        {
            private int bitField0_;
            private Internal.IntList unk3000CNNFGFBBBFP_;
            private LunchBoxDataOuterClass.LunchBoxData lunchBoxData_;
            private SingleFieldBuilderV3<LunchBoxDataOuterClass.LunchBoxData, LunchBoxDataOuterClass.LunchBoxData.Builder, LunchBoxDataOuterClass.LunchBoxDataOrBuilder> lunchBoxDataBuilder_;
            private List<WidgetCoolDownDataOuterClass.WidgetCoolDownData> coolDownGroupDataList_;
            private RepeatedFieldBuilderV3<WidgetCoolDownDataOuterClass.WidgetCoolDownData, WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder, WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder> coolDownGroupDataListBuilder_;
            private List<AnchorPointDataOuterClass.AnchorPointData> anchorPointList_;
            private RepeatedFieldBuilderV3<AnchorPointDataOuterClass.AnchorPointData, AnchorPointDataOuterClass.AnchorPointData.Builder, AnchorPointDataOuterClass.AnchorPointDataOrBuilder> anchorPointListBuilder_;
            private List<WidgetSlotDataOuterClass.WidgetSlotData> slotList_;
            private RepeatedFieldBuilderV3<WidgetSlotDataOuterClass.WidgetSlotData, WidgetSlotDataOuterClass.WidgetSlotData.Builder, WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> slotListBuilder_;
            private int nextAnchorPointUsableTime_;
            private List<ClientCollectorDataOuterClass.ClientCollectorData> clientCollectorDataList_;
            private RepeatedFieldBuilderV3<ClientCollectorDataOuterClass.ClientCollectorData, ClientCollectorDataOuterClass.ClientCollectorData.Builder, ClientCollectorDataOuterClass.ClientCollectorDataOrBuilder> clientCollectorDataListBuilder_;
            private List<OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData> oneofGatherPointDetectorDataList_;
            private RepeatedFieldBuilderV3<OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData, OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.Builder, OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorDataOrBuilder> oneofGatherPointDetectorDataListBuilder_;
            private List<WidgetCoolDownDataOuterClass.WidgetCoolDownData> normalCoolDownDataList_;
            private RepeatedFieldBuilderV3<WidgetCoolDownDataOuterClass.WidgetCoolDownData, WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder, WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder> normalCoolDownDataListBuilder_;
            private Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK unk2700COIELIGEACL_;
            private SingleFieldBuilderV3<Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK, Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK.Builder, Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPKOrBuilder> unk2700COIELIGEACLBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AllWidgetDataNotifyOuterClass.internal_static_AllWidgetDataNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AllWidgetDataNotifyOuterClass.internal_static_AllWidgetDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(AllWidgetDataNotify.class, Builder.class);
            }
            
            private Builder() {
                this.unk3000CNNFGFBBBFP_ = GeneratedMessageV3.emptyIntList();
                this.coolDownGroupDataList_ = Collections.emptyList();
                this.anchorPointList_ = Collections.emptyList();
                this.slotList_ = Collections.emptyList();
                this.clientCollectorDataList_ = Collections.emptyList();
                this.oneofGatherPointDetectorDataList_ = Collections.emptyList();
                this.normalCoolDownDataList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.unk3000CNNFGFBBBFP_ = GeneratedMessageV3.emptyIntList();
                this.coolDownGroupDataList_ = Collections.emptyList();
                this.anchorPointList_ = Collections.emptyList();
                this.slotList_ = Collections.emptyList();
                this.clientCollectorDataList_ = Collections.emptyList();
                this.oneofGatherPointDetectorDataList_ = Collections.emptyList();
                this.normalCoolDownDataList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AllWidgetDataNotify.alwaysUseFieldBuilders) {
                    this.getCoolDownGroupDataListFieldBuilder();
                    this.getAnchorPointListFieldBuilder();
                    this.getSlotListFieldBuilder();
                    this.getClientCollectorDataListFieldBuilder();
                    this.getOneofGatherPointDetectorDataListFieldBuilder();
                    this.getNormalCoolDownDataListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.unk3000CNNFGFBBBFP_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                if (this.lunchBoxDataBuilder_ == null) {
                    this.lunchBoxData_ = null;
                }
                else {
                    this.lunchBoxData_ = null;
                    this.lunchBoxDataBuilder_ = null;
                }
                if (this.coolDownGroupDataListBuilder_ == null) {
                    this.coolDownGroupDataList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                else {
                    this.coolDownGroupDataListBuilder_.clear();
                }
                if (this.anchorPointListBuilder_ == null) {
                    this.anchorPointList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                }
                else {
                    this.anchorPointListBuilder_.clear();
                }
                if (this.slotListBuilder_ == null) {
                    this.slotList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFF7;
                }
                else {
                    this.slotListBuilder_.clear();
                }
                this.nextAnchorPointUsableTime_ = 0;
                if (this.clientCollectorDataListBuilder_ == null) {
                    this.clientCollectorDataList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFEF;
                }
                else {
                    this.clientCollectorDataListBuilder_.clear();
                }
                if (this.oneofGatherPointDetectorDataListBuilder_ == null) {
                    this.oneofGatherPointDetectorDataList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFDF;
                }
                else {
                    this.oneofGatherPointDetectorDataListBuilder_.clear();
                }
                if (this.normalCoolDownDataListBuilder_ == null) {
                    this.normalCoolDownDataList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFBF;
                }
                else {
                    this.normalCoolDownDataListBuilder_.clear();
                }
                if (this.unk2700COIELIGEACLBuilder_ == null) {
                    this.unk2700COIELIGEACL_ = null;
                }
                else {
                    this.unk2700COIELIGEACL_ = null;
                    this.unk2700COIELIGEACLBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AllWidgetDataNotifyOuterClass.internal_static_AllWidgetDataNotify_descriptor;
            }
            
            @Override
            public AllWidgetDataNotify getDefaultInstanceForType() {
                return AllWidgetDataNotify.getDefaultInstance();
            }
            
            @Override
            public AllWidgetDataNotify build() {
                final AllWidgetDataNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AllWidgetDataNotify buildPartial() {
                final AllWidgetDataNotify result = new AllWidgetDataNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.unk3000CNNFGFBBBFP_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.unk3000CNNFGFBBBFP_ = this.unk3000CNNFGFBBBFP_;
                if (this.lunchBoxDataBuilder_ == null) {
                    result.lunchBoxData_ = this.lunchBoxData_;
                }
                else {
                    result.lunchBoxData_ = this.lunchBoxDataBuilder_.build();
                }
                if (this.coolDownGroupDataListBuilder_ == null) {
                    if ((this.bitField0_ & 0x2) != 0x0) {
                        this.coolDownGroupDataList_ = Collections.unmodifiableList((List<? extends WidgetCoolDownDataOuterClass.WidgetCoolDownData>)this.coolDownGroupDataList_);
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    result.coolDownGroupDataList_ = this.coolDownGroupDataList_;
                }
                else {
                    result.coolDownGroupDataList_ = this.coolDownGroupDataListBuilder_.build();
                }
                if (this.anchorPointListBuilder_ == null) {
                    if ((this.bitField0_ & 0x4) != 0x0) {
                        this.anchorPointList_ = Collections.unmodifiableList((List<? extends AnchorPointDataOuterClass.AnchorPointData>)this.anchorPointList_);
                        this.bitField0_ &= 0xFFFFFFFB;
                    }
                    result.anchorPointList_ = this.anchorPointList_;
                }
                else {
                    result.anchorPointList_ = this.anchorPointListBuilder_.build();
                }
                if (this.slotListBuilder_ == null) {
                    if ((this.bitField0_ & 0x8) != 0x0) {
                        this.slotList_ = Collections.unmodifiableList((List<? extends WidgetSlotDataOuterClass.WidgetSlotData>)this.slotList_);
                        this.bitField0_ &= 0xFFFFFFF7;
                    }
                    result.slotList_ = this.slotList_;
                }
                else {
                    result.slotList_ = this.slotListBuilder_.build();
                }
                result.nextAnchorPointUsableTime_ = this.nextAnchorPointUsableTime_;
                if (this.clientCollectorDataListBuilder_ == null) {
                    if ((this.bitField0_ & 0x10) != 0x0) {
                        this.clientCollectorDataList_ = Collections.unmodifiableList((List<? extends ClientCollectorDataOuterClass.ClientCollectorData>)this.clientCollectorDataList_);
                        this.bitField0_ &= 0xFFFFFFEF;
                    }
                    result.clientCollectorDataList_ = this.clientCollectorDataList_;
                }
                else {
                    result.clientCollectorDataList_ = this.clientCollectorDataListBuilder_.build();
                }
                if (this.oneofGatherPointDetectorDataListBuilder_ == null) {
                    if ((this.bitField0_ & 0x20) != 0x0) {
                        this.oneofGatherPointDetectorDataList_ = Collections.unmodifiableList((List<? extends OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData>)this.oneofGatherPointDetectorDataList_);
                        this.bitField0_ &= 0xFFFFFFDF;
                    }
                    result.oneofGatherPointDetectorDataList_ = this.oneofGatherPointDetectorDataList_;
                }
                else {
                    result.oneofGatherPointDetectorDataList_ = this.oneofGatherPointDetectorDataListBuilder_.build();
                }
                if (this.normalCoolDownDataListBuilder_ == null) {
                    if ((this.bitField0_ & 0x40) != 0x0) {
                        this.normalCoolDownDataList_ = Collections.unmodifiableList((List<? extends WidgetCoolDownDataOuterClass.WidgetCoolDownData>)this.normalCoolDownDataList_);
                        this.bitField0_ &= 0xFFFFFFBF;
                    }
                    result.normalCoolDownDataList_ = this.normalCoolDownDataList_;
                }
                else {
                    result.normalCoolDownDataList_ = this.normalCoolDownDataListBuilder_.build();
                }
                if (this.unk2700COIELIGEACLBuilder_ == null) {
                    result.unk2700COIELIGEACL_ = this.unk2700COIELIGEACL_;
                }
                else {
                    result.unk2700COIELIGEACL_ = this.unk2700COIELIGEACLBuilder_.build();
                }
                this.onBuilt();
                return result;
            }
            
            @Override
            public Builder clone() {
                return super.clone();
            }
            
            @Override
            public Builder setField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.setField(field, value);
            }
            
            @Override
            public Builder clearField(final Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            
            @Override
            public Builder clearOneof(final Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            
            @Override
            public Builder setRepeatedField(final Descriptors.FieldDescriptor field, final int index, final Object value) {
                return super.setRepeatedField(field, index, value);
            }
            
            @Override
            public Builder addRepeatedField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.addRepeatedField(field, value);
            }
            
            @Override
            public Builder mergeFrom(final Message other) {
                if (other instanceof AllWidgetDataNotify) {
                    return this.mergeFrom((AllWidgetDataNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AllWidgetDataNotify other) {
                if (other == AllWidgetDataNotify.getDefaultInstance()) {
                    return this;
                }
                if (!other.unk3000CNNFGFBBBFP_.isEmpty()) {
                    if (this.unk3000CNNFGFBBBFP_.isEmpty()) {
                        this.unk3000CNNFGFBBBFP_ = other.unk3000CNNFGFBBBFP_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureUnk3000CNNFGFBBBFPIsMutable();
                        this.unk3000CNNFGFBBBFP_.addAll(other.unk3000CNNFGFBBBFP_);
                    }
                    this.onChanged();
                }
                if (other.hasLunchBoxData()) {
                    this.mergeLunchBoxData(other.getLunchBoxData());
                }
                if (this.coolDownGroupDataListBuilder_ == null) {
                    if (!other.coolDownGroupDataList_.isEmpty()) {
                        if (this.coolDownGroupDataList_.isEmpty()) {
                            this.coolDownGroupDataList_ = other.coolDownGroupDataList_;
                            this.bitField0_ &= 0xFFFFFFFD;
                        }
                        else {
                            this.ensureCoolDownGroupDataListIsMutable();
                            this.coolDownGroupDataList_.addAll(other.coolDownGroupDataList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.coolDownGroupDataList_.isEmpty()) {
                    if (this.coolDownGroupDataListBuilder_.isEmpty()) {
                        this.coolDownGroupDataListBuilder_.dispose();
                        this.coolDownGroupDataListBuilder_ = null;
                        this.coolDownGroupDataList_ = other.coolDownGroupDataList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                        this.coolDownGroupDataListBuilder_ = (AllWidgetDataNotify.alwaysUseFieldBuilders ? this.getCoolDownGroupDataListFieldBuilder() : null);
                    }
                    else {
                        this.coolDownGroupDataListBuilder_.addAllMessages(other.coolDownGroupDataList_);
                    }
                }
                if (this.anchorPointListBuilder_ == null) {
                    if (!other.anchorPointList_.isEmpty()) {
                        if (this.anchorPointList_.isEmpty()) {
                            this.anchorPointList_ = other.anchorPointList_;
                            this.bitField0_ &= 0xFFFFFFFB;
                        }
                        else {
                            this.ensureAnchorPointListIsMutable();
                            this.anchorPointList_.addAll(other.anchorPointList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.anchorPointList_.isEmpty()) {
                    if (this.anchorPointListBuilder_.isEmpty()) {
                        this.anchorPointListBuilder_.dispose();
                        this.anchorPointListBuilder_ = null;
                        this.anchorPointList_ = other.anchorPointList_;
                        this.bitField0_ &= 0xFFFFFFFB;
                        this.anchorPointListBuilder_ = (AllWidgetDataNotify.alwaysUseFieldBuilders ? this.getAnchorPointListFieldBuilder() : null);
                    }
                    else {
                        this.anchorPointListBuilder_.addAllMessages(other.anchorPointList_);
                    }
                }
                if (this.slotListBuilder_ == null) {
                    if (!other.slotList_.isEmpty()) {
                        if (this.slotList_.isEmpty()) {
                            this.slotList_ = other.slotList_;
                            this.bitField0_ &= 0xFFFFFFF7;
                        }
                        else {
                            this.ensureSlotListIsMutable();
                            this.slotList_.addAll(other.slotList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.slotList_.isEmpty()) {
                    if (this.slotListBuilder_.isEmpty()) {
                        this.slotListBuilder_.dispose();
                        this.slotListBuilder_ = null;
                        this.slotList_ = other.slotList_;
                        this.bitField0_ &= 0xFFFFFFF7;
                        this.slotListBuilder_ = (AllWidgetDataNotify.alwaysUseFieldBuilders ? this.getSlotListFieldBuilder() : null);
                    }
                    else {
                        this.slotListBuilder_.addAllMessages(other.slotList_);
                    }
                }
                if (other.getNextAnchorPointUsableTime() != 0) {
                    this.setNextAnchorPointUsableTime(other.getNextAnchorPointUsableTime());
                }
                if (this.clientCollectorDataListBuilder_ == null) {
                    if (!other.clientCollectorDataList_.isEmpty()) {
                        if (this.clientCollectorDataList_.isEmpty()) {
                            this.clientCollectorDataList_ = other.clientCollectorDataList_;
                            this.bitField0_ &= 0xFFFFFFEF;
                        }
                        else {
                            this.ensureClientCollectorDataListIsMutable();
                            this.clientCollectorDataList_.addAll(other.clientCollectorDataList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.clientCollectorDataList_.isEmpty()) {
                    if (this.clientCollectorDataListBuilder_.isEmpty()) {
                        this.clientCollectorDataListBuilder_.dispose();
                        this.clientCollectorDataListBuilder_ = null;
                        this.clientCollectorDataList_ = other.clientCollectorDataList_;
                        this.bitField0_ &= 0xFFFFFFEF;
                        this.clientCollectorDataListBuilder_ = (AllWidgetDataNotify.alwaysUseFieldBuilders ? this.getClientCollectorDataListFieldBuilder() : null);
                    }
                    else {
                        this.clientCollectorDataListBuilder_.addAllMessages(other.clientCollectorDataList_);
                    }
                }
                if (this.oneofGatherPointDetectorDataListBuilder_ == null) {
                    if (!other.oneofGatherPointDetectorDataList_.isEmpty()) {
                        if (this.oneofGatherPointDetectorDataList_.isEmpty()) {
                            this.oneofGatherPointDetectorDataList_ = other.oneofGatherPointDetectorDataList_;
                            this.bitField0_ &= 0xFFFFFFDF;
                        }
                        else {
                            this.ensureOneofGatherPointDetectorDataListIsMutable();
                            this.oneofGatherPointDetectorDataList_.addAll(other.oneofGatherPointDetectorDataList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.oneofGatherPointDetectorDataList_.isEmpty()) {
                    if (this.oneofGatherPointDetectorDataListBuilder_.isEmpty()) {
                        this.oneofGatherPointDetectorDataListBuilder_.dispose();
                        this.oneofGatherPointDetectorDataListBuilder_ = null;
                        this.oneofGatherPointDetectorDataList_ = other.oneofGatherPointDetectorDataList_;
                        this.bitField0_ &= 0xFFFFFFDF;
                        this.oneofGatherPointDetectorDataListBuilder_ = (AllWidgetDataNotify.alwaysUseFieldBuilders ? this.getOneofGatherPointDetectorDataListFieldBuilder() : null);
                    }
                    else {
                        this.oneofGatherPointDetectorDataListBuilder_.addAllMessages(other.oneofGatherPointDetectorDataList_);
                    }
                }
                if (this.normalCoolDownDataListBuilder_ == null) {
                    if (!other.normalCoolDownDataList_.isEmpty()) {
                        if (this.normalCoolDownDataList_.isEmpty()) {
                            this.normalCoolDownDataList_ = other.normalCoolDownDataList_;
                            this.bitField0_ &= 0xFFFFFFBF;
                        }
                        else {
                            this.ensureNormalCoolDownDataListIsMutable();
                            this.normalCoolDownDataList_.addAll(other.normalCoolDownDataList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.normalCoolDownDataList_.isEmpty()) {
                    if (this.normalCoolDownDataListBuilder_.isEmpty()) {
                        this.normalCoolDownDataListBuilder_.dispose();
                        this.normalCoolDownDataListBuilder_ = null;
                        this.normalCoolDownDataList_ = other.normalCoolDownDataList_;
                        this.bitField0_ &= 0xFFFFFFBF;
                        this.normalCoolDownDataListBuilder_ = (AllWidgetDataNotify.alwaysUseFieldBuilders ? this.getNormalCoolDownDataListFieldBuilder() : null);
                    }
                    else {
                        this.normalCoolDownDataListBuilder_.addAllMessages(other.normalCoolDownDataList_);
                    }
                }
                if (other.hasUnk2700COIELIGEACL()) {
                    this.mergeUnk2700COIELIGEACL(other.getUnk2700COIELIGEACL());
                }
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }
            
            @Override
            public final boolean isInitialized() {
                return true;
            }
            
            @Override
            public Builder mergeFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                AllWidgetDataNotify parsedMessage = null;
                try {
                    parsedMessage = AllWidgetDataNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AllWidgetDataNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureUnk3000CNNFGFBBBFPIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.unk3000CNNFGFBBBFP_ = GeneratedMessageV3.mutableCopy(this.unk3000CNNFGFBBBFP_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getUnk3000CNNFGFBBBFPList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.unk3000CNNFGFBBBFP_) : this.unk3000CNNFGFBBBFP_;
            }
            
            @Override
            public int getUnk3000CNNFGFBBBFPCount() {
                return this.unk3000CNNFGFBBBFP_.size();
            }
            
            @Override
            public int getUnk3000CNNFGFBBBFP(final int index) {
                return this.unk3000CNNFGFBBBFP_.getInt(index);
            }
            
            public Builder setUnk3000CNNFGFBBBFP(final int index, final int value) {
                this.ensureUnk3000CNNFGFBBBFPIsMutable();
                this.unk3000CNNFGFBBBFP_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addUnk3000CNNFGFBBBFP(final int value) {
                this.ensureUnk3000CNNFGFBBBFPIsMutable();
                this.unk3000CNNFGFBBBFP_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllUnk3000CNNFGFBBBFP(final Iterable<? extends Integer> values) {
                this.ensureUnk3000CNNFGFBBBFPIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.unk3000CNNFGFBBBFP_);
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk3000CNNFGFBBBFP() {
                this.unk3000CNNFGFBBBFP_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasLunchBoxData() {
                return this.lunchBoxDataBuilder_ != null || this.lunchBoxData_ != null;
            }
            
            @Override
            public LunchBoxDataOuterClass.LunchBoxData getLunchBoxData() {
                if (this.lunchBoxDataBuilder_ == null) {
                    return (this.lunchBoxData_ == null) ? LunchBoxDataOuterClass.LunchBoxData.getDefaultInstance() : this.lunchBoxData_;
                }
                return this.lunchBoxDataBuilder_.getMessage();
            }
            
            public Builder setLunchBoxData(final LunchBoxDataOuterClass.LunchBoxData value) {
                if (this.lunchBoxDataBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.lunchBoxData_ = value;
                    this.onChanged();
                }
                else {
                    this.lunchBoxDataBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setLunchBoxData(final LunchBoxDataOuterClass.LunchBoxData.Builder builderForValue) {
                if (this.lunchBoxDataBuilder_ == null) {
                    this.lunchBoxData_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.lunchBoxDataBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeLunchBoxData(final LunchBoxDataOuterClass.LunchBoxData value) {
                if (this.lunchBoxDataBuilder_ == null) {
                    if (this.lunchBoxData_ != null) {
                        this.lunchBoxData_ = LunchBoxDataOuterClass.LunchBoxData.newBuilder(this.lunchBoxData_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.lunchBoxData_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.lunchBoxDataBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearLunchBoxData() {
                if (this.lunchBoxDataBuilder_ == null) {
                    this.lunchBoxData_ = null;
                    this.onChanged();
                }
                else {
                    this.lunchBoxData_ = null;
                    this.lunchBoxDataBuilder_ = null;
                }
                return this;
            }
            
            public LunchBoxDataOuterClass.LunchBoxData.Builder getLunchBoxDataBuilder() {
                this.onChanged();
                return this.getLunchBoxDataFieldBuilder().getBuilder();
            }
            
            @Override
            public LunchBoxDataOuterClass.LunchBoxDataOrBuilder getLunchBoxDataOrBuilder() {
                if (this.lunchBoxDataBuilder_ != null) {
                    return this.lunchBoxDataBuilder_.getMessageOrBuilder();
                }
                return (this.lunchBoxData_ == null) ? LunchBoxDataOuterClass.LunchBoxData.getDefaultInstance() : this.lunchBoxData_;
            }
            
            private SingleFieldBuilderV3<LunchBoxDataOuterClass.LunchBoxData, LunchBoxDataOuterClass.LunchBoxData.Builder, LunchBoxDataOuterClass.LunchBoxDataOrBuilder> getLunchBoxDataFieldBuilder() {
                if (this.lunchBoxDataBuilder_ == null) {
                    this.lunchBoxDataBuilder_ = new SingleFieldBuilderV3<LunchBoxDataOuterClass.LunchBoxData, LunchBoxDataOuterClass.LunchBoxData.Builder, LunchBoxDataOuterClass.LunchBoxDataOrBuilder>(this.getLunchBoxData(), this.getParentForChildren(), this.isClean());
                    this.lunchBoxData_ = null;
                }
                return this.lunchBoxDataBuilder_;
            }
            
            private void ensureCoolDownGroupDataListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.coolDownGroupDataList_ = new ArrayList<WidgetCoolDownDataOuterClass.WidgetCoolDownData>(this.coolDownGroupDataList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<WidgetCoolDownDataOuterClass.WidgetCoolDownData> getCoolDownGroupDataListList() {
                if (this.coolDownGroupDataListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends WidgetCoolDownDataOuterClass.WidgetCoolDownData>)this.coolDownGroupDataList_);
                }
                return this.coolDownGroupDataListBuilder_.getMessageList();
            }
            
            @Override
            public int getCoolDownGroupDataListCount() {
                if (this.coolDownGroupDataListBuilder_ == null) {
                    return this.coolDownGroupDataList_.size();
                }
                return this.coolDownGroupDataListBuilder_.getCount();
            }
            
            @Override
            public WidgetCoolDownDataOuterClass.WidgetCoolDownData getCoolDownGroupDataList(final int index) {
                if (this.coolDownGroupDataListBuilder_ == null) {
                    return this.coolDownGroupDataList_.get(index);
                }
                return this.coolDownGroupDataListBuilder_.getMessage(index);
            }
            
            public Builder setCoolDownGroupDataList(final int index, final WidgetCoolDownDataOuterClass.WidgetCoolDownData value) {
                if (this.coolDownGroupDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureCoolDownGroupDataListIsMutable();
                    this.coolDownGroupDataList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.coolDownGroupDataListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setCoolDownGroupDataList(final int index, final WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder builderForValue) {
                if (this.coolDownGroupDataListBuilder_ == null) {
                    this.ensureCoolDownGroupDataListIsMutable();
                    this.coolDownGroupDataList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.coolDownGroupDataListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addCoolDownGroupDataList(final WidgetCoolDownDataOuterClass.WidgetCoolDownData value) {
                if (this.coolDownGroupDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureCoolDownGroupDataListIsMutable();
                    this.coolDownGroupDataList_.add(value);
                    this.onChanged();
                }
                else {
                    this.coolDownGroupDataListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addCoolDownGroupDataList(final int index, final WidgetCoolDownDataOuterClass.WidgetCoolDownData value) {
                if (this.coolDownGroupDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureCoolDownGroupDataListIsMutable();
                    this.coolDownGroupDataList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.coolDownGroupDataListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addCoolDownGroupDataList(final WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder builderForValue) {
                if (this.coolDownGroupDataListBuilder_ == null) {
                    this.ensureCoolDownGroupDataListIsMutable();
                    this.coolDownGroupDataList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.coolDownGroupDataListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addCoolDownGroupDataList(final int index, final WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder builderForValue) {
                if (this.coolDownGroupDataListBuilder_ == null) {
                    this.ensureCoolDownGroupDataListIsMutable();
                    this.coolDownGroupDataList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.coolDownGroupDataListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllCoolDownGroupDataList(final Iterable<? extends WidgetCoolDownDataOuterClass.WidgetCoolDownData> values) {
                if (this.coolDownGroupDataListBuilder_ == null) {
                    this.ensureCoolDownGroupDataListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.coolDownGroupDataList_);
                    this.onChanged();
                }
                else {
                    this.coolDownGroupDataListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearCoolDownGroupDataList() {
                if (this.coolDownGroupDataListBuilder_ == null) {
                    this.coolDownGroupDataList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                    this.onChanged();
                }
                else {
                    this.coolDownGroupDataListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeCoolDownGroupDataList(final int index) {
                if (this.coolDownGroupDataListBuilder_ == null) {
                    this.ensureCoolDownGroupDataListIsMutable();
                    this.coolDownGroupDataList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.coolDownGroupDataListBuilder_.remove(index);
                }
                return this;
            }
            
            public WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder getCoolDownGroupDataListBuilder(final int index) {
                return this.getCoolDownGroupDataListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder getCoolDownGroupDataListOrBuilder(final int index) {
                if (this.coolDownGroupDataListBuilder_ == null) {
                    return this.coolDownGroupDataList_.get(index);
                }
                return this.coolDownGroupDataListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder> getCoolDownGroupDataListOrBuilderList() {
                if (this.coolDownGroupDataListBuilder_ != null) {
                    return this.coolDownGroupDataListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder>)this.coolDownGroupDataList_);
            }
            
            public WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder addCoolDownGroupDataListBuilder() {
                return this.getCoolDownGroupDataListFieldBuilder().addBuilder(WidgetCoolDownDataOuterClass.WidgetCoolDownData.getDefaultInstance());
            }
            
            public WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder addCoolDownGroupDataListBuilder(final int index) {
                return this.getCoolDownGroupDataListFieldBuilder().addBuilder(index, WidgetCoolDownDataOuterClass.WidgetCoolDownData.getDefaultInstance());
            }
            
            public List<WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder> getCoolDownGroupDataListBuilderList() {
                return this.getCoolDownGroupDataListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<WidgetCoolDownDataOuterClass.WidgetCoolDownData, WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder, WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder> getCoolDownGroupDataListFieldBuilder() {
                if (this.coolDownGroupDataListBuilder_ == null) {
                    this.coolDownGroupDataListBuilder_ = new RepeatedFieldBuilderV3<WidgetCoolDownDataOuterClass.WidgetCoolDownData, WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder, WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder>(this.coolDownGroupDataList_, (this.bitField0_ & 0x2) != 0x0, this.getParentForChildren(), this.isClean());
                    this.coolDownGroupDataList_ = null;
                }
                return this.coolDownGroupDataListBuilder_;
            }
            
            private void ensureAnchorPointListIsMutable() {
                if ((this.bitField0_ & 0x4) == 0x0) {
                    this.anchorPointList_ = new ArrayList<AnchorPointDataOuterClass.AnchorPointData>(this.anchorPointList_);
                    this.bitField0_ |= 0x4;
                }
            }
            
            @Override
            public List<AnchorPointDataOuterClass.AnchorPointData> getAnchorPointListList() {
                if (this.anchorPointListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends AnchorPointDataOuterClass.AnchorPointData>)this.anchorPointList_);
                }
                return this.anchorPointListBuilder_.getMessageList();
            }
            
            @Override
            public int getAnchorPointListCount() {
                if (this.anchorPointListBuilder_ == null) {
                    return this.anchorPointList_.size();
                }
                return this.anchorPointListBuilder_.getCount();
            }
            
            @Override
            public AnchorPointDataOuterClass.AnchorPointData getAnchorPointList(final int index) {
                if (this.anchorPointListBuilder_ == null) {
                    return this.anchorPointList_.get(index);
                }
                return this.anchorPointListBuilder_.getMessage(index);
            }
            
            public Builder setAnchorPointList(final int index, final AnchorPointDataOuterClass.AnchorPointData value) {
                if (this.anchorPointListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureAnchorPointListIsMutable();
                    this.anchorPointList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.anchorPointListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setAnchorPointList(final int index, final AnchorPointDataOuterClass.AnchorPointData.Builder builderForValue) {
                if (this.anchorPointListBuilder_ == null) {
                    this.ensureAnchorPointListIsMutable();
                    this.anchorPointList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.anchorPointListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAnchorPointList(final AnchorPointDataOuterClass.AnchorPointData value) {
                if (this.anchorPointListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureAnchorPointListIsMutable();
                    this.anchorPointList_.add(value);
                    this.onChanged();
                }
                else {
                    this.anchorPointListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addAnchorPointList(final int index, final AnchorPointDataOuterClass.AnchorPointData value) {
                if (this.anchorPointListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureAnchorPointListIsMutable();
                    this.anchorPointList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.anchorPointListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addAnchorPointList(final AnchorPointDataOuterClass.AnchorPointData.Builder builderForValue) {
                if (this.anchorPointListBuilder_ == null) {
                    this.ensureAnchorPointListIsMutable();
                    this.anchorPointList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.anchorPointListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addAnchorPointList(final int index, final AnchorPointDataOuterClass.AnchorPointData.Builder builderForValue) {
                if (this.anchorPointListBuilder_ == null) {
                    this.ensureAnchorPointListIsMutable();
                    this.anchorPointList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.anchorPointListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllAnchorPointList(final Iterable<? extends AnchorPointDataOuterClass.AnchorPointData> values) {
                if (this.anchorPointListBuilder_ == null) {
                    this.ensureAnchorPointListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.anchorPointList_);
                    this.onChanged();
                }
                else {
                    this.anchorPointListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearAnchorPointList() {
                if (this.anchorPointListBuilder_ == null) {
                    this.anchorPointList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                    this.onChanged();
                }
                else {
                    this.anchorPointListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeAnchorPointList(final int index) {
                if (this.anchorPointListBuilder_ == null) {
                    this.ensureAnchorPointListIsMutable();
                    this.anchorPointList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.anchorPointListBuilder_.remove(index);
                }
                return this;
            }
            
            public AnchorPointDataOuterClass.AnchorPointData.Builder getAnchorPointListBuilder(final int index) {
                return this.getAnchorPointListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public AnchorPointDataOuterClass.AnchorPointDataOrBuilder getAnchorPointListOrBuilder(final int index) {
                if (this.anchorPointListBuilder_ == null) {
                    return this.anchorPointList_.get(index);
                }
                return this.anchorPointListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends AnchorPointDataOuterClass.AnchorPointDataOrBuilder> getAnchorPointListOrBuilderList() {
                if (this.anchorPointListBuilder_ != null) {
                    return this.anchorPointListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends AnchorPointDataOuterClass.AnchorPointDataOrBuilder>)this.anchorPointList_);
            }
            
            public AnchorPointDataOuterClass.AnchorPointData.Builder addAnchorPointListBuilder() {
                return this.getAnchorPointListFieldBuilder().addBuilder(AnchorPointDataOuterClass.AnchorPointData.getDefaultInstance());
            }
            
            public AnchorPointDataOuterClass.AnchorPointData.Builder addAnchorPointListBuilder(final int index) {
                return this.getAnchorPointListFieldBuilder().addBuilder(index, AnchorPointDataOuterClass.AnchorPointData.getDefaultInstance());
            }
            
            public List<AnchorPointDataOuterClass.AnchorPointData.Builder> getAnchorPointListBuilderList() {
                return this.getAnchorPointListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<AnchorPointDataOuterClass.AnchorPointData, AnchorPointDataOuterClass.AnchorPointData.Builder, AnchorPointDataOuterClass.AnchorPointDataOrBuilder> getAnchorPointListFieldBuilder() {
                if (this.anchorPointListBuilder_ == null) {
                    this.anchorPointListBuilder_ = new RepeatedFieldBuilderV3<AnchorPointDataOuterClass.AnchorPointData, AnchorPointDataOuterClass.AnchorPointData.Builder, AnchorPointDataOuterClass.AnchorPointDataOrBuilder>(this.anchorPointList_, (this.bitField0_ & 0x4) != 0x0, this.getParentForChildren(), this.isClean());
                    this.anchorPointList_ = null;
                }
                return this.anchorPointListBuilder_;
            }
            
            private void ensureSlotListIsMutable() {
                if ((this.bitField0_ & 0x8) == 0x0) {
                    this.slotList_ = new ArrayList<WidgetSlotDataOuterClass.WidgetSlotData>(this.slotList_);
                    this.bitField0_ |= 0x8;
                }
            }
            
            @Override
            public List<WidgetSlotDataOuterClass.WidgetSlotData> getSlotListList() {
                if (this.slotListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends WidgetSlotDataOuterClass.WidgetSlotData>)this.slotList_);
                }
                return this.slotListBuilder_.getMessageList();
            }
            
            @Override
            public int getSlotListCount() {
                if (this.slotListBuilder_ == null) {
                    return this.slotList_.size();
                }
                return this.slotListBuilder_.getCount();
            }
            
            @Override
            public WidgetSlotDataOuterClass.WidgetSlotData getSlotList(final int index) {
                if (this.slotListBuilder_ == null) {
                    return this.slotList_.get(index);
                }
                return this.slotListBuilder_.getMessage(index);
            }
            
            public Builder setSlotList(final int index, final WidgetSlotDataOuterClass.WidgetSlotData value) {
                if (this.slotListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureSlotListIsMutable();
                    this.slotList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.slotListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setSlotList(final int index, final WidgetSlotDataOuterClass.WidgetSlotData.Builder builderForValue) {
                if (this.slotListBuilder_ == null) {
                    this.ensureSlotListIsMutable();
                    this.slotList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.slotListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addSlotList(final WidgetSlotDataOuterClass.WidgetSlotData value) {
                if (this.slotListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureSlotListIsMutable();
                    this.slotList_.add(value);
                    this.onChanged();
                }
                else {
                    this.slotListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addSlotList(final int index, final WidgetSlotDataOuterClass.WidgetSlotData value) {
                if (this.slotListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureSlotListIsMutable();
                    this.slotList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.slotListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addSlotList(final WidgetSlotDataOuterClass.WidgetSlotData.Builder builderForValue) {
                if (this.slotListBuilder_ == null) {
                    this.ensureSlotListIsMutable();
                    this.slotList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.slotListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addSlotList(final int index, final WidgetSlotDataOuterClass.WidgetSlotData.Builder builderForValue) {
                if (this.slotListBuilder_ == null) {
                    this.ensureSlotListIsMutable();
                    this.slotList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.slotListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllSlotList(final Iterable<? extends WidgetSlotDataOuterClass.WidgetSlotData> values) {
                if (this.slotListBuilder_ == null) {
                    this.ensureSlotListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.slotList_);
                    this.onChanged();
                }
                else {
                    this.slotListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearSlotList() {
                if (this.slotListBuilder_ == null) {
                    this.slotList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFF7;
                    this.onChanged();
                }
                else {
                    this.slotListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeSlotList(final int index) {
                if (this.slotListBuilder_ == null) {
                    this.ensureSlotListIsMutable();
                    this.slotList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.slotListBuilder_.remove(index);
                }
                return this;
            }
            
            public WidgetSlotDataOuterClass.WidgetSlotData.Builder getSlotListBuilder(final int index) {
                return this.getSlotListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder getSlotListOrBuilder(final int index) {
                if (this.slotListBuilder_ == null) {
                    return this.slotList_.get(index);
                }
                return this.slotListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> getSlotListOrBuilderList() {
                if (this.slotListBuilder_ != null) {
                    return this.slotListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder>)this.slotList_);
            }
            
            public WidgetSlotDataOuterClass.WidgetSlotData.Builder addSlotListBuilder() {
                return this.getSlotListFieldBuilder().addBuilder(WidgetSlotDataOuterClass.WidgetSlotData.getDefaultInstance());
            }
            
            public WidgetSlotDataOuterClass.WidgetSlotData.Builder addSlotListBuilder(final int index) {
                return this.getSlotListFieldBuilder().addBuilder(index, WidgetSlotDataOuterClass.WidgetSlotData.getDefaultInstance());
            }
            
            public List<WidgetSlotDataOuterClass.WidgetSlotData.Builder> getSlotListBuilderList() {
                return this.getSlotListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<WidgetSlotDataOuterClass.WidgetSlotData, WidgetSlotDataOuterClass.WidgetSlotData.Builder, WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> getSlotListFieldBuilder() {
                if (this.slotListBuilder_ == null) {
                    this.slotListBuilder_ = new RepeatedFieldBuilderV3<WidgetSlotDataOuterClass.WidgetSlotData, WidgetSlotDataOuterClass.WidgetSlotData.Builder, WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder>(this.slotList_, (this.bitField0_ & 0x8) != 0x0, this.getParentForChildren(), this.isClean());
                    this.slotList_ = null;
                }
                return this.slotListBuilder_;
            }
            
            @Override
            public int getNextAnchorPointUsableTime() {
                return this.nextAnchorPointUsableTime_;
            }
            
            public Builder setNextAnchorPointUsableTime(final int value) {
                this.nextAnchorPointUsableTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearNextAnchorPointUsableTime() {
                this.nextAnchorPointUsableTime_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureClientCollectorDataListIsMutable() {
                if ((this.bitField0_ & 0x10) == 0x0) {
                    this.clientCollectorDataList_ = new ArrayList<ClientCollectorDataOuterClass.ClientCollectorData>(this.clientCollectorDataList_);
                    this.bitField0_ |= 0x10;
                }
            }
            
            @Override
            public List<ClientCollectorDataOuterClass.ClientCollectorData> getClientCollectorDataListList() {
                if (this.clientCollectorDataListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ClientCollectorDataOuterClass.ClientCollectorData>)this.clientCollectorDataList_);
                }
                return this.clientCollectorDataListBuilder_.getMessageList();
            }
            
            @Override
            public int getClientCollectorDataListCount() {
                if (this.clientCollectorDataListBuilder_ == null) {
                    return this.clientCollectorDataList_.size();
                }
                return this.clientCollectorDataListBuilder_.getCount();
            }
            
            @Override
            public ClientCollectorDataOuterClass.ClientCollectorData getClientCollectorDataList(final int index) {
                if (this.clientCollectorDataListBuilder_ == null) {
                    return this.clientCollectorDataList_.get(index);
                }
                return this.clientCollectorDataListBuilder_.getMessage(index);
            }
            
            public Builder setClientCollectorDataList(final int index, final ClientCollectorDataOuterClass.ClientCollectorData value) {
                if (this.clientCollectorDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureClientCollectorDataListIsMutable();
                    this.clientCollectorDataList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.clientCollectorDataListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setClientCollectorDataList(final int index, final ClientCollectorDataOuterClass.ClientCollectorData.Builder builderForValue) {
                if (this.clientCollectorDataListBuilder_ == null) {
                    this.ensureClientCollectorDataListIsMutable();
                    this.clientCollectorDataList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.clientCollectorDataListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addClientCollectorDataList(final ClientCollectorDataOuterClass.ClientCollectorData value) {
                if (this.clientCollectorDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureClientCollectorDataListIsMutable();
                    this.clientCollectorDataList_.add(value);
                    this.onChanged();
                }
                else {
                    this.clientCollectorDataListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addClientCollectorDataList(final int index, final ClientCollectorDataOuterClass.ClientCollectorData value) {
                if (this.clientCollectorDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureClientCollectorDataListIsMutable();
                    this.clientCollectorDataList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.clientCollectorDataListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addClientCollectorDataList(final ClientCollectorDataOuterClass.ClientCollectorData.Builder builderForValue) {
                if (this.clientCollectorDataListBuilder_ == null) {
                    this.ensureClientCollectorDataListIsMutable();
                    this.clientCollectorDataList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.clientCollectorDataListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addClientCollectorDataList(final int index, final ClientCollectorDataOuterClass.ClientCollectorData.Builder builderForValue) {
                if (this.clientCollectorDataListBuilder_ == null) {
                    this.ensureClientCollectorDataListIsMutable();
                    this.clientCollectorDataList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.clientCollectorDataListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllClientCollectorDataList(final Iterable<? extends ClientCollectorDataOuterClass.ClientCollectorData> values) {
                if (this.clientCollectorDataListBuilder_ == null) {
                    this.ensureClientCollectorDataListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.clientCollectorDataList_);
                    this.onChanged();
                }
                else {
                    this.clientCollectorDataListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearClientCollectorDataList() {
                if (this.clientCollectorDataListBuilder_ == null) {
                    this.clientCollectorDataList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFEF;
                    this.onChanged();
                }
                else {
                    this.clientCollectorDataListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeClientCollectorDataList(final int index) {
                if (this.clientCollectorDataListBuilder_ == null) {
                    this.ensureClientCollectorDataListIsMutable();
                    this.clientCollectorDataList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.clientCollectorDataListBuilder_.remove(index);
                }
                return this;
            }
            
            public ClientCollectorDataOuterClass.ClientCollectorData.Builder getClientCollectorDataListBuilder(final int index) {
                return this.getClientCollectorDataListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ClientCollectorDataOuterClass.ClientCollectorDataOrBuilder getClientCollectorDataListOrBuilder(final int index) {
                if (this.clientCollectorDataListBuilder_ == null) {
                    return this.clientCollectorDataList_.get(index);
                }
                return this.clientCollectorDataListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ClientCollectorDataOuterClass.ClientCollectorDataOrBuilder> getClientCollectorDataListOrBuilderList() {
                if (this.clientCollectorDataListBuilder_ != null) {
                    return this.clientCollectorDataListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ClientCollectorDataOuterClass.ClientCollectorDataOrBuilder>)this.clientCollectorDataList_);
            }
            
            public ClientCollectorDataOuterClass.ClientCollectorData.Builder addClientCollectorDataListBuilder() {
                return this.getClientCollectorDataListFieldBuilder().addBuilder(ClientCollectorDataOuterClass.ClientCollectorData.getDefaultInstance());
            }
            
            public ClientCollectorDataOuterClass.ClientCollectorData.Builder addClientCollectorDataListBuilder(final int index) {
                return this.getClientCollectorDataListFieldBuilder().addBuilder(index, ClientCollectorDataOuterClass.ClientCollectorData.getDefaultInstance());
            }
            
            public List<ClientCollectorDataOuterClass.ClientCollectorData.Builder> getClientCollectorDataListBuilderList() {
                return this.getClientCollectorDataListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ClientCollectorDataOuterClass.ClientCollectorData, ClientCollectorDataOuterClass.ClientCollectorData.Builder, ClientCollectorDataOuterClass.ClientCollectorDataOrBuilder> getClientCollectorDataListFieldBuilder() {
                if (this.clientCollectorDataListBuilder_ == null) {
                    this.clientCollectorDataListBuilder_ = new RepeatedFieldBuilderV3<ClientCollectorDataOuterClass.ClientCollectorData, ClientCollectorDataOuterClass.ClientCollectorData.Builder, ClientCollectorDataOuterClass.ClientCollectorDataOrBuilder>(this.clientCollectorDataList_, (this.bitField0_ & 0x10) != 0x0, this.getParentForChildren(), this.isClean());
                    this.clientCollectorDataList_ = null;
                }
                return this.clientCollectorDataListBuilder_;
            }
            
            private void ensureOneofGatherPointDetectorDataListIsMutable() {
                if ((this.bitField0_ & 0x20) == 0x0) {
                    this.oneofGatherPointDetectorDataList_ = new ArrayList<OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData>(this.oneofGatherPointDetectorDataList_);
                    this.bitField0_ |= 0x20;
                }
            }
            
            @Override
            public List<OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData> getOneofGatherPointDetectorDataListList() {
                if (this.oneofGatherPointDetectorDataListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData>)this.oneofGatherPointDetectorDataList_);
                }
                return this.oneofGatherPointDetectorDataListBuilder_.getMessageList();
            }
            
            @Override
            public int getOneofGatherPointDetectorDataListCount() {
                if (this.oneofGatherPointDetectorDataListBuilder_ == null) {
                    return this.oneofGatherPointDetectorDataList_.size();
                }
                return this.oneofGatherPointDetectorDataListBuilder_.getCount();
            }
            
            @Override
            public OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData getOneofGatherPointDetectorDataList(final int index) {
                if (this.oneofGatherPointDetectorDataListBuilder_ == null) {
                    return this.oneofGatherPointDetectorDataList_.get(index);
                }
                return this.oneofGatherPointDetectorDataListBuilder_.getMessage(index);
            }
            
            public Builder setOneofGatherPointDetectorDataList(final int index, final OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData value) {
                if (this.oneofGatherPointDetectorDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureOneofGatherPointDetectorDataListIsMutable();
                    this.oneofGatherPointDetectorDataList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.oneofGatherPointDetectorDataListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setOneofGatherPointDetectorDataList(final int index, final OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.Builder builderForValue) {
                if (this.oneofGatherPointDetectorDataListBuilder_ == null) {
                    this.ensureOneofGatherPointDetectorDataListIsMutable();
                    this.oneofGatherPointDetectorDataList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.oneofGatherPointDetectorDataListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addOneofGatherPointDetectorDataList(final OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData value) {
                if (this.oneofGatherPointDetectorDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureOneofGatherPointDetectorDataListIsMutable();
                    this.oneofGatherPointDetectorDataList_.add(value);
                    this.onChanged();
                }
                else {
                    this.oneofGatherPointDetectorDataListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addOneofGatherPointDetectorDataList(final int index, final OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData value) {
                if (this.oneofGatherPointDetectorDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureOneofGatherPointDetectorDataListIsMutable();
                    this.oneofGatherPointDetectorDataList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.oneofGatherPointDetectorDataListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addOneofGatherPointDetectorDataList(final OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.Builder builderForValue) {
                if (this.oneofGatherPointDetectorDataListBuilder_ == null) {
                    this.ensureOneofGatherPointDetectorDataListIsMutable();
                    this.oneofGatherPointDetectorDataList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.oneofGatherPointDetectorDataListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addOneofGatherPointDetectorDataList(final int index, final OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.Builder builderForValue) {
                if (this.oneofGatherPointDetectorDataListBuilder_ == null) {
                    this.ensureOneofGatherPointDetectorDataListIsMutable();
                    this.oneofGatherPointDetectorDataList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.oneofGatherPointDetectorDataListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllOneofGatherPointDetectorDataList(final Iterable<? extends OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData> values) {
                if (this.oneofGatherPointDetectorDataListBuilder_ == null) {
                    this.ensureOneofGatherPointDetectorDataListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.oneofGatherPointDetectorDataList_);
                    this.onChanged();
                }
                else {
                    this.oneofGatherPointDetectorDataListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearOneofGatherPointDetectorDataList() {
                if (this.oneofGatherPointDetectorDataListBuilder_ == null) {
                    this.oneofGatherPointDetectorDataList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFDF;
                    this.onChanged();
                }
                else {
                    this.oneofGatherPointDetectorDataListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeOneofGatherPointDetectorDataList(final int index) {
                if (this.oneofGatherPointDetectorDataListBuilder_ == null) {
                    this.ensureOneofGatherPointDetectorDataListIsMutable();
                    this.oneofGatherPointDetectorDataList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.oneofGatherPointDetectorDataListBuilder_.remove(index);
                }
                return this;
            }
            
            public OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.Builder getOneofGatherPointDetectorDataListBuilder(final int index) {
                return this.getOneofGatherPointDetectorDataListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorDataOrBuilder getOneofGatherPointDetectorDataListOrBuilder(final int index) {
                if (this.oneofGatherPointDetectorDataListBuilder_ == null) {
                    return this.oneofGatherPointDetectorDataList_.get(index);
                }
                return this.oneofGatherPointDetectorDataListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorDataOrBuilder> getOneofGatherPointDetectorDataListOrBuilderList() {
                if (this.oneofGatherPointDetectorDataListBuilder_ != null) {
                    return this.oneofGatherPointDetectorDataListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorDataOrBuilder>)this.oneofGatherPointDetectorDataList_);
            }
            
            public OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.Builder addOneofGatherPointDetectorDataListBuilder() {
                return this.getOneofGatherPointDetectorDataListFieldBuilder().addBuilder(OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.getDefaultInstance());
            }
            
            public OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.Builder addOneofGatherPointDetectorDataListBuilder(final int index) {
                return this.getOneofGatherPointDetectorDataListFieldBuilder().addBuilder(index, OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.getDefaultInstance());
            }
            
            public List<OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.Builder> getOneofGatherPointDetectorDataListBuilderList() {
                return this.getOneofGatherPointDetectorDataListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData, OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.Builder, OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorDataOrBuilder> getOneofGatherPointDetectorDataListFieldBuilder() {
                if (this.oneofGatherPointDetectorDataListBuilder_ == null) {
                    this.oneofGatherPointDetectorDataListBuilder_ = new RepeatedFieldBuilderV3<OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData, OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.Builder, OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorDataOrBuilder>(this.oneofGatherPointDetectorDataList_, (this.bitField0_ & 0x20) != 0x0, this.getParentForChildren(), this.isClean());
                    this.oneofGatherPointDetectorDataList_ = null;
                }
                return this.oneofGatherPointDetectorDataListBuilder_;
            }
            
            private void ensureNormalCoolDownDataListIsMutable() {
                if ((this.bitField0_ & 0x40) == 0x0) {
                    this.normalCoolDownDataList_ = new ArrayList<WidgetCoolDownDataOuterClass.WidgetCoolDownData>(this.normalCoolDownDataList_);
                    this.bitField0_ |= 0x40;
                }
            }
            
            @Override
            public List<WidgetCoolDownDataOuterClass.WidgetCoolDownData> getNormalCoolDownDataListList() {
                if (this.normalCoolDownDataListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends WidgetCoolDownDataOuterClass.WidgetCoolDownData>)this.normalCoolDownDataList_);
                }
                return this.normalCoolDownDataListBuilder_.getMessageList();
            }
            
            @Override
            public int getNormalCoolDownDataListCount() {
                if (this.normalCoolDownDataListBuilder_ == null) {
                    return this.normalCoolDownDataList_.size();
                }
                return this.normalCoolDownDataListBuilder_.getCount();
            }
            
            @Override
            public WidgetCoolDownDataOuterClass.WidgetCoolDownData getNormalCoolDownDataList(final int index) {
                if (this.normalCoolDownDataListBuilder_ == null) {
                    return this.normalCoolDownDataList_.get(index);
                }
                return this.normalCoolDownDataListBuilder_.getMessage(index);
            }
            
            public Builder setNormalCoolDownDataList(final int index, final WidgetCoolDownDataOuterClass.WidgetCoolDownData value) {
                if (this.normalCoolDownDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureNormalCoolDownDataListIsMutable();
                    this.normalCoolDownDataList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.normalCoolDownDataListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setNormalCoolDownDataList(final int index, final WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder builderForValue) {
                if (this.normalCoolDownDataListBuilder_ == null) {
                    this.ensureNormalCoolDownDataListIsMutable();
                    this.normalCoolDownDataList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.normalCoolDownDataListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addNormalCoolDownDataList(final WidgetCoolDownDataOuterClass.WidgetCoolDownData value) {
                if (this.normalCoolDownDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureNormalCoolDownDataListIsMutable();
                    this.normalCoolDownDataList_.add(value);
                    this.onChanged();
                }
                else {
                    this.normalCoolDownDataListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addNormalCoolDownDataList(final int index, final WidgetCoolDownDataOuterClass.WidgetCoolDownData value) {
                if (this.normalCoolDownDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureNormalCoolDownDataListIsMutable();
                    this.normalCoolDownDataList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.normalCoolDownDataListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addNormalCoolDownDataList(final WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder builderForValue) {
                if (this.normalCoolDownDataListBuilder_ == null) {
                    this.ensureNormalCoolDownDataListIsMutable();
                    this.normalCoolDownDataList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.normalCoolDownDataListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addNormalCoolDownDataList(final int index, final WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder builderForValue) {
                if (this.normalCoolDownDataListBuilder_ == null) {
                    this.ensureNormalCoolDownDataListIsMutable();
                    this.normalCoolDownDataList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.normalCoolDownDataListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllNormalCoolDownDataList(final Iterable<? extends WidgetCoolDownDataOuterClass.WidgetCoolDownData> values) {
                if (this.normalCoolDownDataListBuilder_ == null) {
                    this.ensureNormalCoolDownDataListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.normalCoolDownDataList_);
                    this.onChanged();
                }
                else {
                    this.normalCoolDownDataListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearNormalCoolDownDataList() {
                if (this.normalCoolDownDataListBuilder_ == null) {
                    this.normalCoolDownDataList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFBF;
                    this.onChanged();
                }
                else {
                    this.normalCoolDownDataListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeNormalCoolDownDataList(final int index) {
                if (this.normalCoolDownDataListBuilder_ == null) {
                    this.ensureNormalCoolDownDataListIsMutable();
                    this.normalCoolDownDataList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.normalCoolDownDataListBuilder_.remove(index);
                }
                return this;
            }
            
            public WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder getNormalCoolDownDataListBuilder(final int index) {
                return this.getNormalCoolDownDataListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder getNormalCoolDownDataListOrBuilder(final int index) {
                if (this.normalCoolDownDataListBuilder_ == null) {
                    return this.normalCoolDownDataList_.get(index);
                }
                return this.normalCoolDownDataListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder> getNormalCoolDownDataListOrBuilderList() {
                if (this.normalCoolDownDataListBuilder_ != null) {
                    return this.normalCoolDownDataListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder>)this.normalCoolDownDataList_);
            }
            
            public WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder addNormalCoolDownDataListBuilder() {
                return this.getNormalCoolDownDataListFieldBuilder().addBuilder(WidgetCoolDownDataOuterClass.WidgetCoolDownData.getDefaultInstance());
            }
            
            public WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder addNormalCoolDownDataListBuilder(final int index) {
                return this.getNormalCoolDownDataListFieldBuilder().addBuilder(index, WidgetCoolDownDataOuterClass.WidgetCoolDownData.getDefaultInstance());
            }
            
            public List<WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder> getNormalCoolDownDataListBuilderList() {
                return this.getNormalCoolDownDataListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<WidgetCoolDownDataOuterClass.WidgetCoolDownData, WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder, WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder> getNormalCoolDownDataListFieldBuilder() {
                if (this.normalCoolDownDataListBuilder_ == null) {
                    this.normalCoolDownDataListBuilder_ = new RepeatedFieldBuilderV3<WidgetCoolDownDataOuterClass.WidgetCoolDownData, WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder, WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder>(this.normalCoolDownDataList_, (this.bitField0_ & 0x40) != 0x0, this.getParentForChildren(), this.isClean());
                    this.normalCoolDownDataList_ = null;
                }
                return this.normalCoolDownDataListBuilder_;
            }
            
            @Override
            public boolean hasUnk2700COIELIGEACL() {
                return this.unk2700COIELIGEACLBuilder_ != null || this.unk2700COIELIGEACL_ != null;
            }
            
            @Override
            public Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK getUnk2700COIELIGEACL() {
                if (this.unk2700COIELIGEACLBuilder_ == null) {
                    return (this.unk2700COIELIGEACL_ == null) ? Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK.getDefaultInstance() : this.unk2700COIELIGEACL_;
                }
                return this.unk2700COIELIGEACLBuilder_.getMessage();
            }
            
            public Builder setUnk2700COIELIGEACL(final Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK value) {
                if (this.unk2700COIELIGEACLBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.unk2700COIELIGEACL_ = value;
                    this.onChanged();
                }
                else {
                    this.unk2700COIELIGEACLBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setUnk2700COIELIGEACL(final Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK.Builder builderForValue) {
                if (this.unk2700COIELIGEACLBuilder_ == null) {
                    this.unk2700COIELIGEACL_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.unk2700COIELIGEACLBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeUnk2700COIELIGEACL(final Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK value) {
                if (this.unk2700COIELIGEACLBuilder_ == null) {
                    if (this.unk2700COIELIGEACL_ != null) {
                        this.unk2700COIELIGEACL_ = Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK.newBuilder(this.unk2700COIELIGEACL_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.unk2700COIELIGEACL_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.unk2700COIELIGEACLBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearUnk2700COIELIGEACL() {
                if (this.unk2700COIELIGEACLBuilder_ == null) {
                    this.unk2700COIELIGEACL_ = null;
                    this.onChanged();
                }
                else {
                    this.unk2700COIELIGEACL_ = null;
                    this.unk2700COIELIGEACLBuilder_ = null;
                }
                return this;
            }
            
            public Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK.Builder getUnk2700COIELIGEACLBuilder() {
                this.onChanged();
                return this.getUnk2700COIELIGEACLFieldBuilder().getBuilder();
            }
            
            @Override
            public Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPKOrBuilder getUnk2700COIELIGEACLOrBuilder() {
                if (this.unk2700COIELIGEACLBuilder_ != null) {
                    return this.unk2700COIELIGEACLBuilder_.getMessageOrBuilder();
                }
                return (this.unk2700COIELIGEACL_ == null) ? Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK.getDefaultInstance() : this.unk2700COIELIGEACL_;
            }
            
            private SingleFieldBuilderV3<Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK, Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK.Builder, Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPKOrBuilder> getUnk2700COIELIGEACLFieldBuilder() {
                if (this.unk2700COIELIGEACLBuilder_ == null) {
                    this.unk2700COIELIGEACLBuilder_ = new SingleFieldBuilderV3<Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK, Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK.Builder, Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPKOrBuilder>(this.getUnk2700COIELIGEACL(), this.getParentForChildren(), this.isClean());
                    this.unk2700COIELIGEACL_ = null;
                }
                return this.unk2700COIELIGEACLBuilder_;
            }
            
            @Override
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface AllWidgetDataNotifyOrBuilder extends MessageOrBuilder
    {
        List<Integer> getUnk3000CNNFGFBBBFPList();
        
        int getUnk3000CNNFGFBBBFPCount();
        
        int getUnk3000CNNFGFBBBFP(final int p0);
        
        boolean hasLunchBoxData();
        
        LunchBoxDataOuterClass.LunchBoxData getLunchBoxData();
        
        LunchBoxDataOuterClass.LunchBoxDataOrBuilder getLunchBoxDataOrBuilder();
        
        List<WidgetCoolDownDataOuterClass.WidgetCoolDownData> getCoolDownGroupDataListList();
        
        WidgetCoolDownDataOuterClass.WidgetCoolDownData getCoolDownGroupDataList(final int p0);
        
        int getCoolDownGroupDataListCount();
        
        List<? extends WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder> getCoolDownGroupDataListOrBuilderList();
        
        WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder getCoolDownGroupDataListOrBuilder(final int p0);
        
        List<AnchorPointDataOuterClass.AnchorPointData> getAnchorPointListList();
        
        AnchorPointDataOuterClass.AnchorPointData getAnchorPointList(final int p0);
        
        int getAnchorPointListCount();
        
        List<? extends AnchorPointDataOuterClass.AnchorPointDataOrBuilder> getAnchorPointListOrBuilderList();
        
        AnchorPointDataOuterClass.AnchorPointDataOrBuilder getAnchorPointListOrBuilder(final int p0);
        
        List<WidgetSlotDataOuterClass.WidgetSlotData> getSlotListList();
        
        WidgetSlotDataOuterClass.WidgetSlotData getSlotList(final int p0);
        
        int getSlotListCount();
        
        List<? extends WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> getSlotListOrBuilderList();
        
        WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder getSlotListOrBuilder(final int p0);
        
        int getNextAnchorPointUsableTime();
        
        List<ClientCollectorDataOuterClass.ClientCollectorData> getClientCollectorDataListList();
        
        ClientCollectorDataOuterClass.ClientCollectorData getClientCollectorDataList(final int p0);
        
        int getClientCollectorDataListCount();
        
        List<? extends ClientCollectorDataOuterClass.ClientCollectorDataOrBuilder> getClientCollectorDataListOrBuilderList();
        
        ClientCollectorDataOuterClass.ClientCollectorDataOrBuilder getClientCollectorDataListOrBuilder(final int p0);
        
        List<OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData> getOneofGatherPointDetectorDataListList();
        
        OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData getOneofGatherPointDetectorDataList(final int p0);
        
        int getOneofGatherPointDetectorDataListCount();
        
        List<? extends OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorDataOrBuilder> getOneofGatherPointDetectorDataListOrBuilderList();
        
        OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorDataOrBuilder getOneofGatherPointDetectorDataListOrBuilder(final int p0);
        
        List<WidgetCoolDownDataOuterClass.WidgetCoolDownData> getNormalCoolDownDataListList();
        
        WidgetCoolDownDataOuterClass.WidgetCoolDownData getNormalCoolDownDataList(final int p0);
        
        int getNormalCoolDownDataListCount();
        
        List<? extends WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder> getNormalCoolDownDataListOrBuilderList();
        
        WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder getNormalCoolDownDataListOrBuilder(final int p0);
        
        boolean hasUnk2700COIELIGEACL();
        
        Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK getUnk2700COIELIGEACL();
        
        Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPKOrBuilder getUnk2700COIELIGEACLOrBuilder();
    }
}
