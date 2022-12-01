// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
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

public final class ForgeQueueManipulateRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_ForgeQueueManipulateRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ForgeQueueManipulateRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ForgeQueueManipulateRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ForgeQueueManipulateRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001dForgeQueueManipulateRsp.proto\u001a\u001eForgeQueueManipulateType.proto\u001a\u000fItemParam.proto\"\u00d6\u0001\n\u0017ForgeQueueManipulateRsp\u00122\n\u000fmanipulate_type\u0018\u0004 \u0001(\u000e2\u0019.ForgeQueueManipulateType\u0012*\n\u0016extra_output_item_list\u0018\r \u0003(\u000b2\n.ItemParam\u0012$\n\u0010return_item_list\u0018\n \u0003(\u000b2\n.ItemParam\u0012\u000f\n\u0007retcode\u0018\u0001 \u0001(\u0005\u0012$\n\u0010output_item_list\u0018\t \u0003(\u000b2\n.ItemParamB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ForgeQueueManipulateRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ForgeQueueManipulateTypeOuterClass.getDescriptor(), ItemParamOuterClass.getDescriptor() });
        internal_static_ForgeQueueManipulateRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ForgeQueueManipulateRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ForgeQueueManipulateRspOuterClass.internal_static_ForgeQueueManipulateRsp_descriptor, new String[] { "ManipulateType", "ExtraOutputItemList", "ReturnItemList", "Retcode", "OutputItemList" });
        ForgeQueueManipulateTypeOuterClass.getDescriptor();
        ItemParamOuterClass.getDescriptor();
    }
    
    public static final class ForgeQueueManipulateRsp extends GeneratedMessageV3 implements ForgeQueueManipulateRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int MANIPULATE_TYPE_FIELD_NUMBER = 4;
        private int manipulateType_;
        public static final int EXTRA_OUTPUT_ITEM_LIST_FIELD_NUMBER = 13;
        private List<ItemParamOuterClass.ItemParam> extraOutputItemList_;
        public static final int RETURN_ITEM_LIST_FIELD_NUMBER = 10;
        private List<ItemParamOuterClass.ItemParam> returnItemList_;
        public static final int RETCODE_FIELD_NUMBER = 1;
        private int retcode_;
        public static final int OUTPUT_ITEM_LIST_FIELD_NUMBER = 9;
        private List<ItemParamOuterClass.ItemParam> outputItemList_;
        private byte memoizedIsInitialized;
        private static final ForgeQueueManipulateRsp DEFAULT_INSTANCE;
        private static final Parser<ForgeQueueManipulateRsp> PARSER;
        
        private ForgeQueueManipulateRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private ForgeQueueManipulateRsp() {
            this.memoizedIsInitialized = -1;
            this.manipulateType_ = 0;
            this.extraOutputItemList_ = Collections.emptyList();
            this.returnItemList_ = Collections.emptyList();
            this.outputItemList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ForgeQueueManipulateRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ForgeQueueManipulateRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 8: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 32: {
                            final int rawValue = input.readEnum();
                            this.manipulateType_ = rawValue;
                            continue;
                        }
                        case 74: {
                            if ((mutable_bitField0_ & 0x4) == 0x0) {
                                this.outputItemList_ = new ArrayList<ItemParamOuterClass.ItemParam>();
                                mutable_bitField0_ |= 0x4;
                            }
                            this.outputItemList_.add(input.readMessage(ItemParamOuterClass.ItemParam.parser(), extensionRegistry));
                            continue;
                        }
                        case 82: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.returnItemList_ = new ArrayList<ItemParamOuterClass.ItemParam>();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.returnItemList_.add(input.readMessage(ItemParamOuterClass.ItemParam.parser(), extensionRegistry));
                            continue;
                        }
                        case 106: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.extraOutputItemList_ = new ArrayList<ItemParamOuterClass.ItemParam>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.extraOutputItemList_.add(input.readMessage(ItemParamOuterClass.ItemParam.parser(), extensionRegistry));
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
                    this.outputItemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.outputItemList_);
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.returnItemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.returnItemList_);
                }
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.extraOutputItemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.extraOutputItemList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return ForgeQueueManipulateRspOuterClass.internal_static_ForgeQueueManipulateRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ForgeQueueManipulateRspOuterClass.internal_static_ForgeQueueManipulateRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(ForgeQueueManipulateRsp.class, Builder.class);
        }
        
        @Override
        public int getManipulateTypeValue() {
            return this.manipulateType_;
        }
        
        @Override
        public ForgeQueueManipulateTypeOuterClass.ForgeQueueManipulateType getManipulateType() {
            final ForgeQueueManipulateTypeOuterClass.ForgeQueueManipulateType result = ForgeQueueManipulateTypeOuterClass.ForgeQueueManipulateType.valueOf(this.manipulateType_);
            return (result == null) ? ForgeQueueManipulateTypeOuterClass.ForgeQueueManipulateType.UNRECOGNIZED : result;
        }
        
        @Override
        public List<ItemParamOuterClass.ItemParam> getExtraOutputItemListList() {
            return this.extraOutputItemList_;
        }
        
        @Override
        public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getExtraOutputItemListOrBuilderList() {
            return this.extraOutputItemList_;
        }
        
        @Override
        public int getExtraOutputItemListCount() {
            return this.extraOutputItemList_.size();
        }
        
        @Override
        public ItemParamOuterClass.ItemParam getExtraOutputItemList(final int index) {
            return this.extraOutputItemList_.get(index);
        }
        
        @Override
        public ItemParamOuterClass.ItemParamOrBuilder getExtraOutputItemListOrBuilder(final int index) {
            return this.extraOutputItemList_.get(index);
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
            if (this.retcode_ != 0) {
                output.writeInt32(1, this.retcode_);
            }
            if (this.manipulateType_ != ForgeQueueManipulateTypeOuterClass.ForgeQueueManipulateType.FORGE_QUEUE_MANIPULATE_TYPE_RECEIVE_OUTPUT.getNumber()) {
                output.writeEnum(4, this.manipulateType_);
            }
            for (int i = 0; i < this.outputItemList_.size(); ++i) {
                output.writeMessage(9, this.outputItemList_.get(i));
            }
            for (int i = 0; i < this.returnItemList_.size(); ++i) {
                output.writeMessage(10, this.returnItemList_.get(i));
            }
            for (int i = 0; i < this.extraOutputItemList_.size(); ++i) {
                output.writeMessage(13, this.extraOutputItemList_.get(i));
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
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(1, this.retcode_);
            }
            if (this.manipulateType_ != ForgeQueueManipulateTypeOuterClass.ForgeQueueManipulateType.FORGE_QUEUE_MANIPULATE_TYPE_RECEIVE_OUTPUT.getNumber()) {
                size += CodedOutputStream.computeEnumSize(4, this.manipulateType_);
            }
            for (int i = 0; i < this.outputItemList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(9, this.outputItemList_.get(i));
            }
            for (int i = 0; i < this.returnItemList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(10, this.returnItemList_.get(i));
            }
            for (int i = 0; i < this.extraOutputItemList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(13, this.extraOutputItemList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ForgeQueueManipulateRsp)) {
                return super.equals(obj);
            }
            final ForgeQueueManipulateRsp other = (ForgeQueueManipulateRsp)obj;
            return this.manipulateType_ == other.manipulateType_ && this.getExtraOutputItemListList().equals(other.getExtraOutputItemListList()) && this.getReturnItemListList().equals(other.getReturnItemListList()) && this.getRetcode() == other.getRetcode() && this.getOutputItemListList().equals(other.getOutputItemListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.manipulateType_;
            if (this.getExtraOutputItemListCount() > 0) {
                hash = 37 * hash + 13;
                hash = 53 * hash + this.getExtraOutputItemListList().hashCode();
            }
            if (this.getReturnItemListCount() > 0) {
                hash = 37 * hash + 10;
                hash = 53 * hash + this.getReturnItemListList().hashCode();
            }
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getRetcode();
            if (this.getOutputItemListCount() > 0) {
                hash = 37 * hash + 9;
                hash = 53 * hash + this.getOutputItemListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ForgeQueueManipulateRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ForgeQueueManipulateRsp.PARSER.parseFrom(data);
        }
        
        public static ForgeQueueManipulateRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ForgeQueueManipulateRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ForgeQueueManipulateRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ForgeQueueManipulateRsp.PARSER.parseFrom(data);
        }
        
        public static ForgeQueueManipulateRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ForgeQueueManipulateRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ForgeQueueManipulateRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ForgeQueueManipulateRsp.PARSER.parseFrom(data);
        }
        
        public static ForgeQueueManipulateRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ForgeQueueManipulateRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ForgeQueueManipulateRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ForgeQueueManipulateRsp.PARSER, input);
        }
        
        public static ForgeQueueManipulateRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ForgeQueueManipulateRsp.PARSER, input, extensionRegistry);
        }
        
        public static ForgeQueueManipulateRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ForgeQueueManipulateRsp.PARSER, input);
        }
        
        public static ForgeQueueManipulateRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ForgeQueueManipulateRsp.PARSER, input, extensionRegistry);
        }
        
        public static ForgeQueueManipulateRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ForgeQueueManipulateRsp.PARSER, input);
        }
        
        public static ForgeQueueManipulateRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ForgeQueueManipulateRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ForgeQueueManipulateRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ForgeQueueManipulateRsp prototype) {
            return ForgeQueueManipulateRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ForgeQueueManipulateRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ForgeQueueManipulateRsp getDefaultInstance() {
            return ForgeQueueManipulateRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<ForgeQueueManipulateRsp> parser() {
            return ForgeQueueManipulateRsp.PARSER;
        }
        
        @Override
        public Parser<ForgeQueueManipulateRsp> getParserForType() {
            return ForgeQueueManipulateRsp.PARSER;
        }
        
        @Override
        public ForgeQueueManipulateRsp getDefaultInstanceForType() {
            return ForgeQueueManipulateRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ForgeQueueManipulateRsp();
            PARSER = new AbstractParser<ForgeQueueManipulateRsp>() {
                @Override
                public ForgeQueueManipulateRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ForgeQueueManipulateRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ForgeQueueManipulateRspOrBuilder
        {
            private int bitField0_;
            private int manipulateType_;
            private List<ItemParamOuterClass.ItemParam> extraOutputItemList_;
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> extraOutputItemListBuilder_;
            private List<ItemParamOuterClass.ItemParam> returnItemList_;
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> returnItemListBuilder_;
            private int retcode_;
            private List<ItemParamOuterClass.ItemParam> outputItemList_;
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> outputItemListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ForgeQueueManipulateRspOuterClass.internal_static_ForgeQueueManipulateRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ForgeQueueManipulateRspOuterClass.internal_static_ForgeQueueManipulateRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(ForgeQueueManipulateRsp.class, Builder.class);
            }
            
            private Builder() {
                this.manipulateType_ = 0;
                this.extraOutputItemList_ = Collections.emptyList();
                this.returnItemList_ = Collections.emptyList();
                this.outputItemList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.manipulateType_ = 0;
                this.extraOutputItemList_ = Collections.emptyList();
                this.returnItemList_ = Collections.emptyList();
                this.outputItemList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ForgeQueueManipulateRsp.alwaysUseFieldBuilders) {
                    this.getExtraOutputItemListFieldBuilder();
                    this.getReturnItemListFieldBuilder();
                    this.getOutputItemListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.manipulateType_ = 0;
                if (this.extraOutputItemListBuilder_ == null) {
                    this.extraOutputItemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.extraOutputItemListBuilder_.clear();
                }
                if (this.returnItemListBuilder_ == null) {
                    this.returnItemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                else {
                    this.returnItemListBuilder_.clear();
                }
                this.retcode_ = 0;
                if (this.outputItemListBuilder_ == null) {
                    this.outputItemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                }
                else {
                    this.outputItemListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ForgeQueueManipulateRspOuterClass.internal_static_ForgeQueueManipulateRsp_descriptor;
            }
            
            @Override
            public ForgeQueueManipulateRsp getDefaultInstanceForType() {
                return ForgeQueueManipulateRsp.getDefaultInstance();
            }
            
            @Override
            public ForgeQueueManipulateRsp build() {
                final ForgeQueueManipulateRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ForgeQueueManipulateRsp buildPartial() {
                final ForgeQueueManipulateRsp result = new ForgeQueueManipulateRsp(this);
                final int from_bitField0_ = this.bitField0_;
                result.manipulateType_ = this.manipulateType_;
                if (this.extraOutputItemListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.extraOutputItemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.extraOutputItemList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.extraOutputItemList_ = this.extraOutputItemList_;
                }
                else {
                    result.extraOutputItemList_ = this.extraOutputItemListBuilder_.build();
                }
                if (this.returnItemListBuilder_ == null) {
                    if ((this.bitField0_ & 0x2) != 0x0) {
                        this.returnItemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.returnItemList_);
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    result.returnItemList_ = this.returnItemList_;
                }
                else {
                    result.returnItemList_ = this.returnItemListBuilder_.build();
                }
                result.retcode_ = this.retcode_;
                if (this.outputItemListBuilder_ == null) {
                    if ((this.bitField0_ & 0x4) != 0x0) {
                        this.outputItemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.outputItemList_);
                        this.bitField0_ &= 0xFFFFFFFB;
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
                if (other instanceof ForgeQueueManipulateRsp) {
                    return this.mergeFrom((ForgeQueueManipulateRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ForgeQueueManipulateRsp other) {
                if (other == ForgeQueueManipulateRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.manipulateType_ != 0) {
                    this.setManipulateTypeValue(other.getManipulateTypeValue());
                }
                if (this.extraOutputItemListBuilder_ == null) {
                    if (!other.extraOutputItemList_.isEmpty()) {
                        if (this.extraOutputItemList_.isEmpty()) {
                            this.extraOutputItemList_ = other.extraOutputItemList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureExtraOutputItemListIsMutable();
                            this.extraOutputItemList_.addAll(other.extraOutputItemList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.extraOutputItemList_.isEmpty()) {
                    if (this.extraOutputItemListBuilder_.isEmpty()) {
                        this.extraOutputItemListBuilder_.dispose();
                        this.extraOutputItemListBuilder_ = null;
                        this.extraOutputItemList_ = other.extraOutputItemList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.extraOutputItemListBuilder_ = (ForgeQueueManipulateRsp.alwaysUseFieldBuilders ? this.getExtraOutputItemListFieldBuilder() : null);
                    }
                    else {
                        this.extraOutputItemListBuilder_.addAllMessages(other.extraOutputItemList_);
                    }
                }
                if (this.returnItemListBuilder_ == null) {
                    if (!other.returnItemList_.isEmpty()) {
                        if (this.returnItemList_.isEmpty()) {
                            this.returnItemList_ = other.returnItemList_;
                            this.bitField0_ &= 0xFFFFFFFD;
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
                        this.bitField0_ &= 0xFFFFFFFD;
                        this.returnItemListBuilder_ = (ForgeQueueManipulateRsp.alwaysUseFieldBuilders ? this.getReturnItemListFieldBuilder() : null);
                    }
                    else {
                        this.returnItemListBuilder_.addAllMessages(other.returnItemList_);
                    }
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (this.outputItemListBuilder_ == null) {
                    if (!other.outputItemList_.isEmpty()) {
                        if (this.outputItemList_.isEmpty()) {
                            this.outputItemList_ = other.outputItemList_;
                            this.bitField0_ &= 0xFFFFFFFB;
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
                        this.bitField0_ &= 0xFFFFFFFB;
                        this.outputItemListBuilder_ = (ForgeQueueManipulateRsp.alwaysUseFieldBuilders ? this.getOutputItemListFieldBuilder() : null);
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
                ForgeQueueManipulateRsp parsedMessage = null;
                try {
                    parsedMessage = ForgeQueueManipulateRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ForgeQueueManipulateRsp)e.getUnfinishedMessage();
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
            public int getManipulateTypeValue() {
                return this.manipulateType_;
            }
            
            public Builder setManipulateTypeValue(final int value) {
                this.manipulateType_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public ForgeQueueManipulateTypeOuterClass.ForgeQueueManipulateType getManipulateType() {
                final ForgeQueueManipulateTypeOuterClass.ForgeQueueManipulateType result = ForgeQueueManipulateTypeOuterClass.ForgeQueueManipulateType.valueOf(this.manipulateType_);
                return (result == null) ? ForgeQueueManipulateTypeOuterClass.ForgeQueueManipulateType.UNRECOGNIZED : result;
            }
            
            public Builder setManipulateType(final ForgeQueueManipulateTypeOuterClass.ForgeQueueManipulateType value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.manipulateType_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearManipulateType() {
                this.manipulateType_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureExtraOutputItemListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.extraOutputItemList_ = new ArrayList<ItemParamOuterClass.ItemParam>(this.extraOutputItemList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<ItemParamOuterClass.ItemParam> getExtraOutputItemListList() {
                if (this.extraOutputItemListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.extraOutputItemList_);
                }
                return this.extraOutputItemListBuilder_.getMessageList();
            }
            
            @Override
            public int getExtraOutputItemListCount() {
                if (this.extraOutputItemListBuilder_ == null) {
                    return this.extraOutputItemList_.size();
                }
                return this.extraOutputItemListBuilder_.getCount();
            }
            
            @Override
            public ItemParamOuterClass.ItemParam getExtraOutputItemList(final int index) {
                if (this.extraOutputItemListBuilder_ == null) {
                    return this.extraOutputItemList_.get(index);
                }
                return this.extraOutputItemListBuilder_.getMessage(index);
            }
            
            public Builder setExtraOutputItemList(final int index, final ItemParamOuterClass.ItemParam value) {
                if (this.extraOutputItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureExtraOutputItemListIsMutable();
                    this.extraOutputItemList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.extraOutputItemListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setExtraOutputItemList(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.extraOutputItemListBuilder_ == null) {
                    this.ensureExtraOutputItemListIsMutable();
                    this.extraOutputItemList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.extraOutputItemListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addExtraOutputItemList(final ItemParamOuterClass.ItemParam value) {
                if (this.extraOutputItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureExtraOutputItemListIsMutable();
                    this.extraOutputItemList_.add(value);
                    this.onChanged();
                }
                else {
                    this.extraOutputItemListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addExtraOutputItemList(final int index, final ItemParamOuterClass.ItemParam value) {
                if (this.extraOutputItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureExtraOutputItemListIsMutable();
                    this.extraOutputItemList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.extraOutputItemListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addExtraOutputItemList(final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.extraOutputItemListBuilder_ == null) {
                    this.ensureExtraOutputItemListIsMutable();
                    this.extraOutputItemList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.extraOutputItemListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addExtraOutputItemList(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.extraOutputItemListBuilder_ == null) {
                    this.ensureExtraOutputItemListIsMutable();
                    this.extraOutputItemList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.extraOutputItemListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllExtraOutputItemList(final Iterable<? extends ItemParamOuterClass.ItemParam> values) {
                if (this.extraOutputItemListBuilder_ == null) {
                    this.ensureExtraOutputItemListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.extraOutputItemList_);
                    this.onChanged();
                }
                else {
                    this.extraOutputItemListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearExtraOutputItemList() {
                if (this.extraOutputItemListBuilder_ == null) {
                    this.extraOutputItemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.extraOutputItemListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeExtraOutputItemList(final int index) {
                if (this.extraOutputItemListBuilder_ == null) {
                    this.ensureExtraOutputItemListIsMutable();
                    this.extraOutputItemList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.extraOutputItemListBuilder_.remove(index);
                }
                return this;
            }
            
            public ItemParamOuterClass.ItemParam.Builder getExtraOutputItemListBuilder(final int index) {
                return this.getExtraOutputItemListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ItemParamOuterClass.ItemParamOrBuilder getExtraOutputItemListOrBuilder(final int index) {
                if (this.extraOutputItemListBuilder_ == null) {
                    return this.extraOutputItemList_.get(index);
                }
                return this.extraOutputItemListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getExtraOutputItemListOrBuilderList() {
                if (this.extraOutputItemListBuilder_ != null) {
                    return this.extraOutputItemListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParamOrBuilder>)this.extraOutputItemList_);
            }
            
            public ItemParamOuterClass.ItemParam.Builder addExtraOutputItemListBuilder() {
                return this.getExtraOutputItemListFieldBuilder().addBuilder(ItemParamOuterClass.ItemParam.getDefaultInstance());
            }
            
            public ItemParamOuterClass.ItemParam.Builder addExtraOutputItemListBuilder(final int index) {
                return this.getExtraOutputItemListFieldBuilder().addBuilder(index, ItemParamOuterClass.ItemParam.getDefaultInstance());
            }
            
            public List<ItemParamOuterClass.ItemParam.Builder> getExtraOutputItemListBuilderList() {
                return this.getExtraOutputItemListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> getExtraOutputItemListFieldBuilder() {
                if (this.extraOutputItemListBuilder_ == null) {
                    this.extraOutputItemListBuilder_ = new RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder>(this.extraOutputItemList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.extraOutputItemList_ = null;
                }
                return this.extraOutputItemListBuilder_;
            }
            
            private void ensureReturnItemListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.returnItemList_ = new ArrayList<ItemParamOuterClass.ItemParam>(this.returnItemList_);
                    this.bitField0_ |= 0x2;
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
                    this.bitField0_ &= 0xFFFFFFFD;
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
                    this.returnItemListBuilder_ = new RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder>(this.returnItemList_, (this.bitField0_ & 0x2) != 0x0, this.getParentForChildren(), this.isClean());
                    this.returnItemList_ = null;
                }
                return this.returnItemListBuilder_;
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
                if ((this.bitField0_ & 0x4) == 0x0) {
                    this.outputItemList_ = new ArrayList<ItemParamOuterClass.ItemParam>(this.outputItemList_);
                    this.bitField0_ |= 0x4;
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
                    this.bitField0_ &= 0xFFFFFFFB;
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
                    this.outputItemListBuilder_ = new RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder>(this.outputItemList_, (this.bitField0_ & 0x4) != 0x0, this.getParentForChildren(), this.isClean());
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
    
    public interface ForgeQueueManipulateRspOrBuilder extends MessageOrBuilder
    {
        int getManipulateTypeValue();
        
        ForgeQueueManipulateTypeOuterClass.ForgeQueueManipulateType getManipulateType();
        
        List<ItemParamOuterClass.ItemParam> getExtraOutputItemListList();
        
        ItemParamOuterClass.ItemParam getExtraOutputItemList(final int p0);
        
        int getExtraOutputItemListCount();
        
        List<? extends ItemParamOuterClass.ItemParamOrBuilder> getExtraOutputItemListOrBuilderList();
        
        ItemParamOuterClass.ItemParamOrBuilder getExtraOutputItemListOrBuilder(final int p0);
        
        List<ItemParamOuterClass.ItemParam> getReturnItemListList();
        
        ItemParamOuterClass.ItemParam getReturnItemList(final int p0);
        
        int getReturnItemListCount();
        
        List<? extends ItemParamOuterClass.ItemParamOrBuilder> getReturnItemListOrBuilderList();
        
        ItemParamOuterClass.ItemParamOrBuilder getReturnItemListOrBuilder(final int p0);
        
        int getRetcode();
        
        List<ItemParamOuterClass.ItemParam> getOutputItemListList();
        
        ItemParamOuterClass.ItemParam getOutputItemList(final int p0);
        
        int getOutputItemListCount();
        
        List<? extends ItemParamOuterClass.ItemParamOrBuilder> getOutputItemListOrBuilderList();
        
        ItemParamOuterClass.ItemParamOrBuilder getOutputItemListOrBuilder(final int p0);
    }
}
