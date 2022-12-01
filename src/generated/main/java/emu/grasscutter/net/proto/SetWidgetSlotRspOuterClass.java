// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Iterator;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
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
import com.google.protobuf.Internal;
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class SetWidgetSlotRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_SetWidgetSlotRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SetWidgetSlotRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SetWidgetSlotRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SetWidgetSlotRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016SetWidgetSlotRsp.proto\u001a\u0012WidgetSlotOp.proto\u001a\u0013WidgetSlotTag.proto\"u\n\u0010SetWidgetSlotRsp\u0012 \n\btag_list\u0018\u000f \u0003(\u000e2\u000e.WidgetSlotTag\u0012\u000f\n\u0007retcode\u0018\u0006 \u0001(\u0005\u0012\u0013\n\u000bmaterial_id\u0018\u0001 \u0001(\r\u0012\u0019\n\u0002op\u0018\u0004 \u0001(\u000e2\r.WidgetSlotOpB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SetWidgetSlotRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { WidgetSlotOpOuterClass.getDescriptor(), WidgetSlotTagOuterClass.getDescriptor() });
        internal_static_SetWidgetSlotRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SetWidgetSlotRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SetWidgetSlotRspOuterClass.internal_static_SetWidgetSlotRsp_descriptor, new String[] { "TagList", "Retcode", "MaterialId", "Op" });
        WidgetSlotOpOuterClass.getDescriptor();
        WidgetSlotTagOuterClass.getDescriptor();
    }
    
    public static final class SetWidgetSlotRsp extends GeneratedMessageV3 implements SetWidgetSlotRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int TAG_LIST_FIELD_NUMBER = 15;
        private List<Integer> tagList_;
        private static final Internal.ListAdapter.Converter<Integer, WidgetSlotTagOuterClass.WidgetSlotTag> tagList_converter_;
        private int tagListMemoizedSerializedSize;
        public static final int RETCODE_FIELD_NUMBER = 6;
        private int retcode_;
        public static final int MATERIAL_ID_FIELD_NUMBER = 1;
        private int materialId_;
        public static final int OP_FIELD_NUMBER = 4;
        private int op_;
        private byte memoizedIsInitialized;
        private static final SetWidgetSlotRsp DEFAULT_INSTANCE;
        private static final Parser<SetWidgetSlotRsp> PARSER;
        
        private SetWidgetSlotRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private SetWidgetSlotRsp() {
            this.memoizedIsInitialized = -1;
            this.tagList_ = Collections.emptyList();
            this.op_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SetWidgetSlotRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SetWidgetSlotRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.materialId_ = input.readUInt32();
                            continue;
                        }
                        case 32: {
                            final int rawValue = input.readEnum();
                            this.op_ = rawValue;
                            continue;
                        }
                        case 48: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 120: {
                            final int rawValue = input.readEnum();
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.tagList_ = new ArrayList<Integer>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.tagList_.add(rawValue);
                            continue;
                        }
                        case 122: {
                            final int length = input.readRawVarint32();
                            final int oldLimit = input.pushLimit(length);
                            while (input.getBytesUntilLimit() > 0) {
                                final int rawValue2 = input.readEnum();
                                if ((mutable_bitField0_ & 0x1) == 0x0) {
                                    this.tagList_ = new ArrayList<Integer>();
                                    mutable_bitField0_ |= 0x1;
                                }
                                this.tagList_.add(rawValue2);
                            }
                            input.popLimit(oldLimit);
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
                    this.tagList_ = Collections.unmodifiableList((List<? extends Integer>)this.tagList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return SetWidgetSlotRspOuterClass.internal_static_SetWidgetSlotRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SetWidgetSlotRspOuterClass.internal_static_SetWidgetSlotRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(SetWidgetSlotRsp.class, Builder.class);
        }
        
        @Override
        public List<WidgetSlotTagOuterClass.WidgetSlotTag> getTagListList() {
            return (List<WidgetSlotTagOuterClass.WidgetSlotTag>)new Internal.ListAdapter(tagList_, tagList_converter_);
        }
        
        @Override
        public int getTagListCount() {
            return this.tagList_.size();
        }
        
        @Override
        public WidgetSlotTagOuterClass.WidgetSlotTag getTagList(final int index) {
            return SetWidgetSlotRsp.tagList_converter_.convert(this.tagList_.get(index));
        }
        
        @Override
        public List<Integer> getTagListValueList() {
            return this.tagList_;
        }
        
        @Override
        public int getTagListValue(final int index) {
            return this.tagList_.get(index);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public int getMaterialId() {
            return this.materialId_;
        }
        
        @Override
        public int getOpValue() {
            return this.op_;
        }
        
        @Override
        public WidgetSlotOpOuterClass.WidgetSlotOp getOp() {
            final WidgetSlotOpOuterClass.WidgetSlotOp result = WidgetSlotOpOuterClass.WidgetSlotOp.valueOf(this.op_);
            return (result == null) ? WidgetSlotOpOuterClass.WidgetSlotOp.UNRECOGNIZED : result;
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
            if (this.materialId_ != 0) {
                output.writeUInt32(1, this.materialId_);
            }
            if (this.op_ != WidgetSlotOpOuterClass.WidgetSlotOp.WIDGET_SLOT_OP_ATTACH.getNumber()) {
                output.writeEnum(4, this.op_);
            }
            if (this.retcode_ != 0) {
                output.writeInt32(6, this.retcode_);
            }
            if (this.getTagListList().size() > 0) {
                output.writeUInt32NoTag(122);
                output.writeUInt32NoTag(this.tagListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.tagList_.size(); ++i) {
                output.writeEnumNoTag(this.tagList_.get(i));
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
            if (this.materialId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.materialId_);
            }
            if (this.op_ != WidgetSlotOpOuterClass.WidgetSlotOp.WIDGET_SLOT_OP_ATTACH.getNumber()) {
                size += CodedOutputStream.computeEnumSize(4, this.op_);
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(6, this.retcode_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.tagList_.size(); ++i) {
                dataSize += CodedOutputStream.computeEnumSizeNoTag(this.tagList_.get(i));
            }
            size += dataSize;
            if (!this.getTagListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeUInt32SizeNoTag(dataSize);
            }
            this.tagListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SetWidgetSlotRsp)) {
                return super.equals(obj);
            }
            final SetWidgetSlotRsp other = (SetWidgetSlotRsp)obj;
            return this.tagList_.equals(other.tagList_) && this.getRetcode() == other.getRetcode() && this.getMaterialId() == other.getMaterialId() && this.op_ == other.op_ && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getTagListCount() > 0) {
                hash = 37 * hash + 15;
                hash = 53 * hash + this.tagList_.hashCode();
            }
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getMaterialId();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.op_;
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SetWidgetSlotRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SetWidgetSlotRsp.PARSER.parseFrom(data);
        }
        
        public static SetWidgetSlotRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SetWidgetSlotRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SetWidgetSlotRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SetWidgetSlotRsp.PARSER.parseFrom(data);
        }
        
        public static SetWidgetSlotRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SetWidgetSlotRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SetWidgetSlotRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SetWidgetSlotRsp.PARSER.parseFrom(data);
        }
        
        public static SetWidgetSlotRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SetWidgetSlotRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SetWidgetSlotRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetWidgetSlotRsp.PARSER, input);
        }
        
        public static SetWidgetSlotRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetWidgetSlotRsp.PARSER, input, extensionRegistry);
        }
        
        public static SetWidgetSlotRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SetWidgetSlotRsp.PARSER, input);
        }
        
        public static SetWidgetSlotRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SetWidgetSlotRsp.PARSER, input, extensionRegistry);
        }
        
        public static SetWidgetSlotRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetWidgetSlotRsp.PARSER, input);
        }
        
        public static SetWidgetSlotRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetWidgetSlotRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SetWidgetSlotRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SetWidgetSlotRsp prototype) {
            return SetWidgetSlotRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SetWidgetSlotRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SetWidgetSlotRsp getDefaultInstance() {
            return SetWidgetSlotRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<SetWidgetSlotRsp> parser() {
            return SetWidgetSlotRsp.PARSER;
        }
        
        @Override
        public Parser<SetWidgetSlotRsp> getParserForType() {
            return SetWidgetSlotRsp.PARSER;
        }
        
        @Override
        public SetWidgetSlotRsp getDefaultInstanceForType() {
            return SetWidgetSlotRsp.DEFAULT_INSTANCE;
        }
        
        static {
            tagList_converter_ = new Internal.ListAdapter.Converter<Integer, WidgetSlotTagOuterClass.WidgetSlotTag>() {
                @Override
                public WidgetSlotTagOuterClass.WidgetSlotTag convert(final Integer from) {
                    final WidgetSlotTagOuterClass.WidgetSlotTag result = WidgetSlotTagOuterClass.WidgetSlotTag.valueOf(from);
                    return (result == null) ? WidgetSlotTagOuterClass.WidgetSlotTag.UNRECOGNIZED : result;
                }
            };
            DEFAULT_INSTANCE = new SetWidgetSlotRsp();
            PARSER = new AbstractParser<SetWidgetSlotRsp>() {
                @Override
                public SetWidgetSlotRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SetWidgetSlotRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SetWidgetSlotRspOrBuilder
        {
            private int bitField0_;
            private List<Integer> tagList_;
            private int retcode_;
            private int materialId_;
            private int op_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SetWidgetSlotRspOuterClass.internal_static_SetWidgetSlotRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SetWidgetSlotRspOuterClass.internal_static_SetWidgetSlotRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(SetWidgetSlotRsp.class, Builder.class);
            }
            
            private Builder() {
                this.tagList_ = Collections.emptyList();
                this.op_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.tagList_ = Collections.emptyList();
                this.op_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SetWidgetSlotRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.tagList_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.retcode_ = 0;
                this.materialId_ = 0;
                this.op_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SetWidgetSlotRspOuterClass.internal_static_SetWidgetSlotRsp_descriptor;
            }
            
            @Override
            public SetWidgetSlotRsp getDefaultInstanceForType() {
                return SetWidgetSlotRsp.getDefaultInstance();
            }
            
            @Override
            public SetWidgetSlotRsp build() {
                final SetWidgetSlotRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SetWidgetSlotRsp buildPartial() {
                final SetWidgetSlotRsp result = new SetWidgetSlotRsp(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.tagList_ = Collections.unmodifiableList((List<? extends Integer>)this.tagList_);
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.tagList_ = this.tagList_;
                result.retcode_ = this.retcode_;
                result.materialId_ = this.materialId_;
                result.op_ = this.op_;
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
                if (other instanceof SetWidgetSlotRsp) {
                    return this.mergeFrom((SetWidgetSlotRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SetWidgetSlotRsp other) {
                if (other == SetWidgetSlotRsp.getDefaultInstance()) {
                    return this;
                }
                if (!other.tagList_.isEmpty()) {
                    if (this.tagList_.isEmpty()) {
                        this.tagList_ = other.tagList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureTagListIsMutable();
                        this.tagList_.addAll(other.tagList_);
                    }
                    this.onChanged();
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (other.getMaterialId() != 0) {
                    this.setMaterialId(other.getMaterialId());
                }
                if (other.op_ != 0) {
                    this.setOpValue(other.getOpValue());
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
                SetWidgetSlotRsp parsedMessage = null;
                try {
                    parsedMessage = SetWidgetSlotRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SetWidgetSlotRsp)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureTagListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.tagList_ = new ArrayList<Integer>(this.tagList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<WidgetSlotTagOuterClass.WidgetSlotTag> getTagListList() {
                return (List<WidgetSlotTagOuterClass.WidgetSlotTag>)new Internal.ListAdapter(tagList_, tagList_converter_);
            }
            
            @Override
            public int getTagListCount() {
                return this.tagList_.size();
            }
            
            @Override
            public WidgetSlotTagOuterClass.WidgetSlotTag getTagList(final int index) {
                return SetWidgetSlotRsp.tagList_converter_.convert(this.tagList_.get(index));
            }
            
            public Builder setTagList(final int index, final WidgetSlotTagOuterClass.WidgetSlotTag value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureTagListIsMutable();
                this.tagList_.set(index, value.getNumber());
                this.onChanged();
                return this;
            }
            
            public Builder addTagList(final WidgetSlotTagOuterClass.WidgetSlotTag value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureTagListIsMutable();
                this.tagList_.add(value.getNumber());
                this.onChanged();
                return this;
            }
            
            public Builder addAllTagList(final Iterable<? extends WidgetSlotTagOuterClass.WidgetSlotTag> values) {
                this.ensureTagListIsMutable();
                for (final WidgetSlotTagOuterClass.WidgetSlotTag value : values) {
                    this.tagList_.add(value.getNumber());
                }
                this.onChanged();
                return this;
            }
            
            public Builder clearTagList() {
                this.tagList_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            @Override
            public List<Integer> getTagListValueList() {
                return Collections.unmodifiableList((List<? extends Integer>)this.tagList_);
            }
            
            @Override
            public int getTagListValue(final int index) {
                return this.tagList_.get(index);
            }
            
            public Builder setTagListValue(final int index, final int value) {
                this.ensureTagListIsMutable();
                this.tagList_.set(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addTagListValue(final int value) {
                this.ensureTagListIsMutable();
                this.tagList_.add(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllTagListValue(final Iterable<Integer> values) {
                this.ensureTagListIsMutable();
                for (final int value : values) {
                    this.tagList_.add(value);
                }
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
            
            @Override
            public int getMaterialId() {
                return this.materialId_;
            }
            
            public Builder setMaterialId(final int value) {
                this.materialId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMaterialId() {
                this.materialId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getOpValue() {
                return this.op_;
            }
            
            public Builder setOpValue(final int value) {
                this.op_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public WidgetSlotOpOuterClass.WidgetSlotOp getOp() {
                final WidgetSlotOpOuterClass.WidgetSlotOp result = WidgetSlotOpOuterClass.WidgetSlotOp.valueOf(this.op_);
                return (result == null) ? WidgetSlotOpOuterClass.WidgetSlotOp.UNRECOGNIZED : result;
            }
            
            public Builder setOp(final WidgetSlotOpOuterClass.WidgetSlotOp value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.op_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearOp() {
                this.op_ = 0;
                this.onChanged();
                return this;
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
    
    public interface SetWidgetSlotRspOrBuilder extends MessageOrBuilder
    {
        List<WidgetSlotTagOuterClass.WidgetSlotTag> getTagListList();
        
        int getTagListCount();
        
        WidgetSlotTagOuterClass.WidgetSlotTag getTagList(final int p0);
        
        List<Integer> getTagListValueList();
        
        int getTagListValue(final int p0);
        
        int getRetcode();
        
        int getMaterialId();
        
        int getOpValue();
        
        WidgetSlotOpOuterClass.WidgetSlotOp getOp();
    }
}
