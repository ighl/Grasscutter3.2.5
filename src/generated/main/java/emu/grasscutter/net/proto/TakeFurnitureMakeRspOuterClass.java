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
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class TakeFurnitureMakeRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_TakeFurnitureMakeRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_TakeFurnitureMakeRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private TakeFurnitureMakeRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return TakeFurnitureMakeRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001aTakeFurnitureMakeRsp.proto\u001a\u0017FurnitureMakeSlot.proto\u001a\u000fItemParam.proto\"µ\u0001\n\u0014TakeFurnitureMakeRsp\u0012/\n\u0013furniture_make_slot\u0018\b \u0001(\u000b2\u0012.FurnitureMakeSlot\u0012$\n\u0010return_item_list\u0018\u0002 \u0003(\u000b2\n.ItemParam\u0012\u000f\n\u0007make_id\u0018\u0006 \u0001(\r\u0012\u000f\n\u0007retcode\u0018\t \u0001(\u0005\u0012$\n\u0010output_item_list\u0018\u000e \u0003(\u000b2\n.ItemParamB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        TakeFurnitureMakeRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { FurnitureMakeSlotOuterClass.getDescriptor(), ItemParamOuterClass.getDescriptor() });
        internal_static_TakeFurnitureMakeRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_TakeFurnitureMakeRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(TakeFurnitureMakeRspOuterClass.internal_static_TakeFurnitureMakeRsp_descriptor, new String[] { "FurnitureMakeSlot", "ReturnItemList", "MakeId", "Retcode", "OutputItemList" });
        FurnitureMakeSlotOuterClass.getDescriptor();
        ItemParamOuterClass.getDescriptor();
    }
    
    public static final class TakeFurnitureMakeRsp extends GeneratedMessageV3 implements TakeFurnitureMakeRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int FURNITURE_MAKE_SLOT_FIELD_NUMBER = 8;
        private FurnitureMakeSlotOuterClass.FurnitureMakeSlot furnitureMakeSlot_;
        public static final int RETURN_ITEM_LIST_FIELD_NUMBER = 2;
        private List<ItemParamOuterClass.ItemParam> returnItemList_;
        public static final int MAKE_ID_FIELD_NUMBER = 6;
        private int makeId_;
        public static final int RETCODE_FIELD_NUMBER = 9;
        private int retcode_;
        public static final int OUTPUT_ITEM_LIST_FIELD_NUMBER = 14;
        private List<ItemParamOuterClass.ItemParam> outputItemList_;
        private byte memoizedIsInitialized;
        private static final TakeFurnitureMakeRsp DEFAULT_INSTANCE;
        private static final Parser<TakeFurnitureMakeRsp> PARSER;
        
        private TakeFurnitureMakeRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private TakeFurnitureMakeRsp() {
            this.memoizedIsInitialized = -1;
            this.returnItemList_ = Collections.emptyList();
            this.outputItemList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new TakeFurnitureMakeRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private TakeFurnitureMakeRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 18: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.returnItemList_ = new ArrayList<ItemParamOuterClass.ItemParam>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.returnItemList_.add(input.readMessage(ItemParamOuterClass.ItemParam.parser(), extensionRegistry));
                            continue;
                        }
                        case 48: {
                            this.makeId_ = input.readUInt32();
                            continue;
                        }
                        case 66: {
                            FurnitureMakeSlotOuterClass.FurnitureMakeSlot.Builder subBuilder = null;
                            if (this.furnitureMakeSlot_ != null) {
                                subBuilder = this.furnitureMakeSlot_.toBuilder();
                            }
                            this.furnitureMakeSlot_ = input.readMessage(FurnitureMakeSlotOuterClass.FurnitureMakeSlot.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.furnitureMakeSlot_);
                                this.furnitureMakeSlot_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 72: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 114: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.outputItemList_ = new ArrayList<ItemParamOuterClass.ItemParam>();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.outputItemList_.add(input.readMessage(ItemParamOuterClass.ItemParam.parser(), extensionRegistry));
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
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.returnItemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.returnItemList_);
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.outputItemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.outputItemList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return TakeFurnitureMakeRspOuterClass.internal_static_TakeFurnitureMakeRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return TakeFurnitureMakeRspOuterClass.internal_static_TakeFurnitureMakeRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(TakeFurnitureMakeRsp.class, Builder.class);
        }
        
        @Override
        public boolean hasFurnitureMakeSlot() {
            return this.furnitureMakeSlot_ != null;
        }
        
        @Override
        public FurnitureMakeSlotOuterClass.FurnitureMakeSlot getFurnitureMakeSlot() {
            return (this.furnitureMakeSlot_ == null) ? FurnitureMakeSlotOuterClass.FurnitureMakeSlot.getDefaultInstance() : this.furnitureMakeSlot_;
        }
        
        @Override
        public FurnitureMakeSlotOuterClass.FurnitureMakeSlotOrBuilder getFurnitureMakeSlotOrBuilder() {
            return this.getFurnitureMakeSlot();
        }
        
        @Override
        public List<ItemParamOuterClass.ItemParam> getReturnItemListList() {
            return this.returnItemList_;
        }
        
        @Override
        public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getReturnItemListOrBuilderList() {
            return this.returnItemList_;
        }
        
        @Override
        public int getReturnItemListCount() {
            return this.returnItemList_.size();
        }
        
        @Override
        public ItemParamOuterClass.ItemParam getReturnItemList(final int index) {
            return this.returnItemList_.get(index);
        }
        
        @Override
        public ItemParamOuterClass.ItemParamOrBuilder getReturnItemListOrBuilder(final int index) {
            return this.returnItemList_.get(index);
        }
        
        @Override
        public int getMakeId() {
            return this.makeId_;
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public List<ItemParamOuterClass.ItemParam> getOutputItemListList() {
            return this.outputItemList_;
        }
        
        @Override
        public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getOutputItemListOrBuilderList() {
            return this.outputItemList_;
        }
        
        @Override
        public int getOutputItemListCount() {
            return this.outputItemList_.size();
        }
        
        @Override
        public ItemParamOuterClass.ItemParam getOutputItemList(final int index) {
            return this.outputItemList_.get(index);
        }
        
        @Override
        public ItemParamOuterClass.ItemParamOrBuilder getOutputItemListOrBuilder(final int index) {
            return this.outputItemList_.get(index);
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
            for (int i = 0; i < this.returnItemList_.size(); ++i) {
                output.writeMessage(2, this.returnItemList_.get(i));
            }
            if (this.makeId_ != 0) {
                output.writeUInt32(6, this.makeId_);
            }
            if (this.furnitureMakeSlot_ != null) {
                output.writeMessage(8, this.getFurnitureMakeSlot());
            }
            if (this.retcode_ != 0) {
                output.writeInt32(9, this.retcode_);
            }
            for (int i = 0; i < this.outputItemList_.size(); ++i) {
                output.writeMessage(14, this.outputItemList_.get(i));
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
            for (int i = 0; i < this.returnItemList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(2, this.returnItemList_.get(i));
            }
            if (this.makeId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.makeId_);
            }
            if (this.furnitureMakeSlot_ != null) {
                size += CodedOutputStream.computeMessageSize(8, this.getFurnitureMakeSlot());
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(9, this.retcode_);
            }
            for (int i = 0; i < this.outputItemList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(14, this.outputItemList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TakeFurnitureMakeRsp)) {
                return super.equals(obj);
            }
            final TakeFurnitureMakeRsp other = (TakeFurnitureMakeRsp)obj;
            return this.hasFurnitureMakeSlot() == other.hasFurnitureMakeSlot() && (!this.hasFurnitureMakeSlot() || this.getFurnitureMakeSlot().equals(other.getFurnitureMakeSlot())) && this.getReturnItemListList().equals(other.getReturnItemListList()) && this.getMakeId() == other.getMakeId() && this.getRetcode() == other.getRetcode() && this.getOutputItemListList().equals(other.getOutputItemListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasFurnitureMakeSlot()) {
                hash = 37 * hash + 8;
                hash = 53 * hash + this.getFurnitureMakeSlot().hashCode();
            }
            if (this.getReturnItemListCount() > 0) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getReturnItemListList().hashCode();
            }
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getMakeId();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getRetcode();
            if (this.getOutputItemListCount() > 0) {
                hash = 37 * hash + 14;
                hash = 53 * hash + this.getOutputItemListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static TakeFurnitureMakeRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return TakeFurnitureMakeRsp.PARSER.parseFrom(data);
        }
        
        public static TakeFurnitureMakeRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TakeFurnitureMakeRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TakeFurnitureMakeRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return TakeFurnitureMakeRsp.PARSER.parseFrom(data);
        }
        
        public static TakeFurnitureMakeRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TakeFurnitureMakeRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TakeFurnitureMakeRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return TakeFurnitureMakeRsp.PARSER.parseFrom(data);
        }
        
        public static TakeFurnitureMakeRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TakeFurnitureMakeRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TakeFurnitureMakeRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeFurnitureMakeRsp.PARSER, input);
        }
        
        public static TakeFurnitureMakeRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeFurnitureMakeRsp.PARSER, input, extensionRegistry);
        }
        
        public static TakeFurnitureMakeRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TakeFurnitureMakeRsp.PARSER, input);
        }
        
        public static TakeFurnitureMakeRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TakeFurnitureMakeRsp.PARSER, input, extensionRegistry);
        }
        
        public static TakeFurnitureMakeRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeFurnitureMakeRsp.PARSER, input);
        }
        
        public static TakeFurnitureMakeRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeFurnitureMakeRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return TakeFurnitureMakeRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final TakeFurnitureMakeRsp prototype) {
            return TakeFurnitureMakeRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == TakeFurnitureMakeRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static TakeFurnitureMakeRsp getDefaultInstance() {
            return TakeFurnitureMakeRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<TakeFurnitureMakeRsp> parser() {
            return TakeFurnitureMakeRsp.PARSER;
        }
        
        @Override
        public Parser<TakeFurnitureMakeRsp> getParserForType() {
            return TakeFurnitureMakeRsp.PARSER;
        }
        
        @Override
        public TakeFurnitureMakeRsp getDefaultInstanceForType() {
            return TakeFurnitureMakeRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new TakeFurnitureMakeRsp();
            PARSER = new AbstractParser<TakeFurnitureMakeRsp>() {
                @Override
                public TakeFurnitureMakeRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new TakeFurnitureMakeRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TakeFurnitureMakeRspOrBuilder
        {
            private int bitField0_;
            private FurnitureMakeSlotOuterClass.FurnitureMakeSlot furnitureMakeSlot_;
            private SingleFieldBuilderV3<FurnitureMakeSlotOuterClass.FurnitureMakeSlot, FurnitureMakeSlotOuterClass.FurnitureMakeSlot.Builder, FurnitureMakeSlotOuterClass.FurnitureMakeSlotOrBuilder> furnitureMakeSlotBuilder_;
            private List<ItemParamOuterClass.ItemParam> returnItemList_;
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> returnItemListBuilder_;
            private int makeId_;
            private int retcode_;
            private List<ItemParamOuterClass.ItemParam> outputItemList_;
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> outputItemListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return TakeFurnitureMakeRspOuterClass.internal_static_TakeFurnitureMakeRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return TakeFurnitureMakeRspOuterClass.internal_static_TakeFurnitureMakeRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(TakeFurnitureMakeRsp.class, Builder.class);
            }
            
            private Builder() {
                this.returnItemList_ = Collections.emptyList();
                this.outputItemList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.returnItemList_ = Collections.emptyList();
                this.outputItemList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (TakeFurnitureMakeRsp.alwaysUseFieldBuilders) {
                    this.getReturnItemListFieldBuilder();
                    this.getOutputItemListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.furnitureMakeSlotBuilder_ == null) {
                    this.furnitureMakeSlot_ = null;
                }
                else {
                    this.furnitureMakeSlot_ = null;
                    this.furnitureMakeSlotBuilder_ = null;
                }
                if (this.returnItemListBuilder_ == null) {
                    this.returnItemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.returnItemListBuilder_.clear();
                }
                this.makeId_ = 0;
                this.retcode_ = 0;
                if (this.outputItemListBuilder_ == null) {
                    this.outputItemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                else {
                    this.outputItemListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return TakeFurnitureMakeRspOuterClass.internal_static_TakeFurnitureMakeRsp_descriptor;
            }
            
            @Override
            public TakeFurnitureMakeRsp getDefaultInstanceForType() {
                return TakeFurnitureMakeRsp.getDefaultInstance();
            }
            
            @Override
            public TakeFurnitureMakeRsp build() {
                final TakeFurnitureMakeRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public TakeFurnitureMakeRsp buildPartial() {
                final TakeFurnitureMakeRsp result = new TakeFurnitureMakeRsp(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.furnitureMakeSlotBuilder_ == null) {
                    result.furnitureMakeSlot_ = this.furnitureMakeSlot_;
                }
                else {
                    result.furnitureMakeSlot_ = this.furnitureMakeSlotBuilder_.build();
                }
                if (this.returnItemListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.returnItemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.returnItemList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.returnItemList_ = this.returnItemList_;
                }
                else {
                    result.returnItemList_ = this.returnItemListBuilder_.build();
                }
                result.makeId_ = this.makeId_;
                result.retcode_ = this.retcode_;
                if (this.outputItemListBuilder_ == null) {
                    if ((this.bitField0_ & 0x2) != 0x0) {
                        this.outputItemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.outputItemList_);
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    result.outputItemList_ = this.outputItemList_;
                }
                else {
                    result.outputItemList_ = this.outputItemListBuilder_.build();
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
                if (other instanceof TakeFurnitureMakeRsp) {
                    return this.mergeFrom((TakeFurnitureMakeRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final TakeFurnitureMakeRsp other) {
                if (other == TakeFurnitureMakeRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.hasFurnitureMakeSlot()) {
                    this.mergeFurnitureMakeSlot(other.getFurnitureMakeSlot());
                }
                if (this.returnItemListBuilder_ == null) {
                    if (!other.returnItemList_.isEmpty()) {
                        if (this.returnItemList_.isEmpty()) {
                            this.returnItemList_ = other.returnItemList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureReturnItemListIsMutable();
                            this.returnItemList_.addAll(other.returnItemList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.returnItemList_.isEmpty()) {
                    if (this.returnItemListBuilder_.isEmpty()) {
                        this.returnItemListBuilder_.dispose();
                        this.returnItemListBuilder_ = null;
                        this.returnItemList_ = other.returnItemList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.returnItemListBuilder_ = (TakeFurnitureMakeRsp.alwaysUseFieldBuilders ? this.getReturnItemListFieldBuilder() : null);
                    }
                    else {
                        this.returnItemListBuilder_.addAllMessages(other.returnItemList_);
                    }
                }
                if (other.getMakeId() != 0) {
                    this.setMakeId(other.getMakeId());
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (this.outputItemListBuilder_ == null) {
                    if (!other.outputItemList_.isEmpty()) {
                        if (this.outputItemList_.isEmpty()) {
                            this.outputItemList_ = other.outputItemList_;
                            this.bitField0_ &= 0xFFFFFFFD;
                        }
                        else {
                            this.ensureOutputItemListIsMutable();
                            this.outputItemList_.addAll(other.outputItemList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.outputItemList_.isEmpty()) {
                    if (this.outputItemListBuilder_.isEmpty()) {
                        this.outputItemListBuilder_.dispose();
                        this.outputItemListBuilder_ = null;
                        this.outputItemList_ = other.outputItemList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                        this.outputItemListBuilder_ = (TakeFurnitureMakeRsp.alwaysUseFieldBuilders ? this.getOutputItemListFieldBuilder() : null);
                    }
                    else {
                        this.outputItemListBuilder_.addAllMessages(other.outputItemList_);
                    }
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
                TakeFurnitureMakeRsp parsedMessage = null;
                try {
                    parsedMessage = TakeFurnitureMakeRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (TakeFurnitureMakeRsp)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            @Override
            public boolean hasFurnitureMakeSlot() {
                return this.furnitureMakeSlotBuilder_ != null || this.furnitureMakeSlot_ != null;
            }
            
            @Override
            public FurnitureMakeSlotOuterClass.FurnitureMakeSlot getFurnitureMakeSlot() {
                if (this.furnitureMakeSlotBuilder_ == null) {
                    return (this.furnitureMakeSlot_ == null) ? FurnitureMakeSlotOuterClass.FurnitureMakeSlot.getDefaultInstance() : this.furnitureMakeSlot_;
                }
                return this.furnitureMakeSlotBuilder_.getMessage();
            }
            
            public Builder setFurnitureMakeSlot(final FurnitureMakeSlotOuterClass.FurnitureMakeSlot value) {
                if (this.furnitureMakeSlotBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.furnitureMakeSlot_ = value;
                    this.onChanged();
                }
                else {
                    this.furnitureMakeSlotBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setFurnitureMakeSlot(final FurnitureMakeSlotOuterClass.FurnitureMakeSlot.Builder builderForValue) {
                if (this.furnitureMakeSlotBuilder_ == null) {
                    this.furnitureMakeSlot_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.furnitureMakeSlotBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeFurnitureMakeSlot(final FurnitureMakeSlotOuterClass.FurnitureMakeSlot value) {
                if (this.furnitureMakeSlotBuilder_ == null) {
                    if (this.furnitureMakeSlot_ != null) {
                        this.furnitureMakeSlot_ = FurnitureMakeSlotOuterClass.FurnitureMakeSlot.newBuilder(this.furnitureMakeSlot_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.furnitureMakeSlot_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.furnitureMakeSlotBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearFurnitureMakeSlot() {
                if (this.furnitureMakeSlotBuilder_ == null) {
                    this.furnitureMakeSlot_ = null;
                    this.onChanged();
                }
                else {
                    this.furnitureMakeSlot_ = null;
                    this.furnitureMakeSlotBuilder_ = null;
                }
                return this;
            }
            
            public FurnitureMakeSlotOuterClass.FurnitureMakeSlot.Builder getFurnitureMakeSlotBuilder() {
                this.onChanged();
                return this.getFurnitureMakeSlotFieldBuilder().getBuilder();
            }
            
            @Override
            public FurnitureMakeSlotOuterClass.FurnitureMakeSlotOrBuilder getFurnitureMakeSlotOrBuilder() {
                if (this.furnitureMakeSlotBuilder_ != null) {
                    return this.furnitureMakeSlotBuilder_.getMessageOrBuilder();
                }
                return (this.furnitureMakeSlot_ == null) ? FurnitureMakeSlotOuterClass.FurnitureMakeSlot.getDefaultInstance() : this.furnitureMakeSlot_;
            }
            
            private SingleFieldBuilderV3<FurnitureMakeSlotOuterClass.FurnitureMakeSlot, FurnitureMakeSlotOuterClass.FurnitureMakeSlot.Builder, FurnitureMakeSlotOuterClass.FurnitureMakeSlotOrBuilder> getFurnitureMakeSlotFieldBuilder() {
                if (this.furnitureMakeSlotBuilder_ == null) {
                    this.furnitureMakeSlotBuilder_ = new SingleFieldBuilderV3<FurnitureMakeSlotOuterClass.FurnitureMakeSlot, FurnitureMakeSlotOuterClass.FurnitureMakeSlot.Builder, FurnitureMakeSlotOuterClass.FurnitureMakeSlotOrBuilder>(this.getFurnitureMakeSlot(), this.getParentForChildren(), this.isClean());
                    this.furnitureMakeSlot_ = null;
                }
                return this.furnitureMakeSlotBuilder_;
            }
            
            private void ensureReturnItemListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.returnItemList_ = new ArrayList<ItemParamOuterClass.ItemParam>(this.returnItemList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<ItemParamOuterClass.ItemParam> getReturnItemListList() {
                if (this.returnItemListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.returnItemList_);
                }
                return this.returnItemListBuilder_.getMessageList();
            }
            
            @Override
            public int getReturnItemListCount() {
                if (this.returnItemListBuilder_ == null) {
                    return this.returnItemList_.size();
                }
                return this.returnItemListBuilder_.getCount();
            }
            
            @Override
            public ItemParamOuterClass.ItemParam getReturnItemList(final int index) {
                if (this.returnItemListBuilder_ == null) {
                    return this.returnItemList_.get(index);
                }
                return this.returnItemListBuilder_.getMessage(index);
            }
            
            public Builder setReturnItemList(final int index, final ItemParamOuterClass.ItemParam value) {
                if (this.returnItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureReturnItemListIsMutable();
                    this.returnItemList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.returnItemListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setReturnItemList(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.returnItemListBuilder_ == null) {
                    this.ensureReturnItemListIsMutable();
                    this.returnItemList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.returnItemListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addReturnItemList(final ItemParamOuterClass.ItemParam value) {
                if (this.returnItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureReturnItemListIsMutable();
                    this.returnItemList_.add(value);
                    this.onChanged();
                }
                else {
                    this.returnItemListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addReturnItemList(final int index, final ItemParamOuterClass.ItemParam value) {
                if (this.returnItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureReturnItemListIsMutable();
                    this.returnItemList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.returnItemListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addReturnItemList(final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.returnItemListBuilder_ == null) {
                    this.ensureReturnItemListIsMutable();
                    this.returnItemList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.returnItemListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addReturnItemList(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.returnItemListBuilder_ == null) {
                    this.ensureReturnItemListIsMutable();
                    this.returnItemList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.returnItemListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllReturnItemList(final Iterable<? extends ItemParamOuterClass.ItemParam> values) {
                if (this.returnItemListBuilder_ == null) {
                    this.ensureReturnItemListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.returnItemList_);
                    this.onChanged();
                }
                else {
                    this.returnItemListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearReturnItemList() {
                if (this.returnItemListBuilder_ == null) {
                    this.returnItemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.returnItemListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeReturnItemList(final int index) {
                if (this.returnItemListBuilder_ == null) {
                    this.ensureReturnItemListIsMutable();
                    this.returnItemList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.returnItemListBuilder_.remove(index);
                }
                return this;
            }
            
            public ItemParamOuterClass.ItemParam.Builder getReturnItemListBuilder(final int index) {
                return this.getReturnItemListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ItemParamOuterClass.ItemParamOrBuilder getReturnItemListOrBuilder(final int index) {
                if (this.returnItemListBuilder_ == null) {
                    return this.returnItemList_.get(index);
                }
                return this.returnItemListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getReturnItemListOrBuilderList() {
                if (this.returnItemListBuilder_ != null) {
                    return this.returnItemListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParamOrBuilder>)this.returnItemList_);
            }
            
            public ItemParamOuterClass.ItemParam.Builder addReturnItemListBuilder() {
                return this.getReturnItemListFieldBuilder().addBuilder(ItemParamOuterClass.ItemParam.getDefaultInstance());
            }
            
            public ItemParamOuterClass.ItemParam.Builder addReturnItemListBuilder(final int index) {
                return this.getReturnItemListFieldBuilder().addBuilder(index, ItemParamOuterClass.ItemParam.getDefaultInstance());
            }
            
            public List<ItemParamOuterClass.ItemParam.Builder> getReturnItemListBuilderList() {
                return this.getReturnItemListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> getReturnItemListFieldBuilder() {
                if (this.returnItemListBuilder_ == null) {
                    this.returnItemListBuilder_ = new RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder>(this.returnItemList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.returnItemList_ = null;
                }
                return this.returnItemListBuilder_;
            }
            
            @Override
            public int getMakeId() {
                return this.makeId_;
            }
            
            public Builder setMakeId(final int value) {
                this.makeId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMakeId() {
                this.makeId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getRetcode() {
                return this.retcode_;
            }
            
            public Builder setRetcode(final int value) {
                this.retcode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRetcode() {
                this.retcode_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureOutputItemListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.outputItemList_ = new ArrayList<ItemParamOuterClass.ItemParam>(this.outputItemList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<ItemParamOuterClass.ItemParam> getOutputItemListList() {
                if (this.outputItemListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.outputItemList_);
                }
                return this.outputItemListBuilder_.getMessageList();
            }
            
            @Override
            public int getOutputItemListCount() {
                if (this.outputItemListBuilder_ == null) {
                    return this.outputItemList_.size();
                }
                return this.outputItemListBuilder_.getCount();
            }
            
            @Override
            public ItemParamOuterClass.ItemParam getOutputItemList(final int index) {
                if (this.outputItemListBuilder_ == null) {
                    return this.outputItemList_.get(index);
                }
                return this.outputItemListBuilder_.getMessage(index);
            }
            
            public Builder setOutputItemList(final int index, final ItemParamOuterClass.ItemParam value) {
                if (this.outputItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureOutputItemListIsMutable();
                    this.outputItemList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.outputItemListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setOutputItemList(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.outputItemListBuilder_ == null) {
                    this.ensureOutputItemListIsMutable();
                    this.outputItemList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.outputItemListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addOutputItemList(final ItemParamOuterClass.ItemParam value) {
                if (this.outputItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureOutputItemListIsMutable();
                    this.outputItemList_.add(value);
                    this.onChanged();
                }
                else {
                    this.outputItemListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addOutputItemList(final int index, final ItemParamOuterClass.ItemParam value) {
                if (this.outputItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureOutputItemListIsMutable();
                    this.outputItemList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.outputItemListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addOutputItemList(final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.outputItemListBuilder_ == null) {
                    this.ensureOutputItemListIsMutable();
                    this.outputItemList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.outputItemListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addOutputItemList(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.outputItemListBuilder_ == null) {
                    this.ensureOutputItemListIsMutable();
                    this.outputItemList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.outputItemListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllOutputItemList(final Iterable<? extends ItemParamOuterClass.ItemParam> values) {
                if (this.outputItemListBuilder_ == null) {
                    this.ensureOutputItemListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.outputItemList_);
                    this.onChanged();
                }
                else {
                    this.outputItemListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearOutputItemList() {
                if (this.outputItemListBuilder_ == null) {
                    this.outputItemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                    this.onChanged();
                }
                else {
                    this.outputItemListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeOutputItemList(final int index) {
                if (this.outputItemListBuilder_ == null) {
                    this.ensureOutputItemListIsMutable();
                    this.outputItemList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.outputItemListBuilder_.remove(index);
                }
                return this;
            }
            
            public ItemParamOuterClass.ItemParam.Builder getOutputItemListBuilder(final int index) {
                return this.getOutputItemListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ItemParamOuterClass.ItemParamOrBuilder getOutputItemListOrBuilder(final int index) {
                if (this.outputItemListBuilder_ == null) {
                    return this.outputItemList_.get(index);
                }
                return this.outputItemListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getOutputItemListOrBuilderList() {
                if (this.outputItemListBuilder_ != null) {
                    return this.outputItemListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParamOrBuilder>)this.outputItemList_);
            }
            
            public ItemParamOuterClass.ItemParam.Builder addOutputItemListBuilder() {
                return this.getOutputItemListFieldBuilder().addBuilder(ItemParamOuterClass.ItemParam.getDefaultInstance());
            }
            
            public ItemParamOuterClass.ItemParam.Builder addOutputItemListBuilder(final int index) {
                return this.getOutputItemListFieldBuilder().addBuilder(index, ItemParamOuterClass.ItemParam.getDefaultInstance());
            }
            
            public List<ItemParamOuterClass.ItemParam.Builder> getOutputItemListBuilderList() {
                return this.getOutputItemListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> getOutputItemListFieldBuilder() {
                if (this.outputItemListBuilder_ == null) {
                    this.outputItemListBuilder_ = new RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder>(this.outputItemList_, (this.bitField0_ & 0x2) != 0x0, this.getParentForChildren(), this.isClean());
                    this.outputItemList_ = null;
                }
                return this.outputItemListBuilder_;
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
    
    public interface TakeFurnitureMakeRspOrBuilder extends MessageOrBuilder
    {
        boolean hasFurnitureMakeSlot();
        
        FurnitureMakeSlotOuterClass.FurnitureMakeSlot getFurnitureMakeSlot();
        
        FurnitureMakeSlotOuterClass.FurnitureMakeSlotOrBuilder getFurnitureMakeSlotOrBuilder();
        
        List<ItemParamOuterClass.ItemParam> getReturnItemListList();
        
        ItemParamOuterClass.ItemParam getReturnItemList(final int p0);
        
        int getReturnItemListCount();
        
        List<? extends ItemParamOuterClass.ItemParamOrBuilder> getReturnItemListOrBuilderList();
        
        ItemParamOuterClass.ItemParamOrBuilder getReturnItemListOrBuilder(final int p0);
        
        int getMakeId();
        
        int getRetcode();
        
        List<ItemParamOuterClass.ItemParam> getOutputItemListList();
        
        ItemParamOuterClass.ItemParam getOutputItemList(final int p0);
        
        int getOutputItemListCount();
        
        List<? extends ItemParamOuterClass.ItemParamOrBuilder> getOutputItemListOrBuilderList();
        
        ItemParamOuterClass.ItemParamOrBuilder getOutputItemListOrBuilder(final int p0);
    }
}
