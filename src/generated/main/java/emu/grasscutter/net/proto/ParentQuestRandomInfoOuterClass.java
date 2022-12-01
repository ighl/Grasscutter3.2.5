// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collections;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.util.List;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class ParentQuestRandomInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_ParentQuestRandomInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ParentQuestRandomInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ParentQuestRandomInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ParentQuestRandomInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bParentQuestRandomInfo.proto\"V\n\u0015ParentQuestRandomInfo\u0012\u0013\n\u000bfactor_list\u0018\u0001 \u0003(\r\u0012\u0013\n\u000btemplate_id\u0018\b \u0001(\r\u0012\u0013\n\u000bentrance_id\u0018\u0002 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ParentQuestRandomInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_ParentQuestRandomInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ParentQuestRandomInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ParentQuestRandomInfoOuterClass.internal_static_ParentQuestRandomInfo_descriptor, new String[] { "FactorList", "TemplateId", "EntranceId" });
    }
    
    public static final class ParentQuestRandomInfo extends GeneratedMessageV3 implements ParentQuestRandomInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int FACTOR_LIST_FIELD_NUMBER = 1;
        private Internal.IntList factorList_;
        private int factorListMemoizedSerializedSize;
        public static final int TEMPLATE_ID_FIELD_NUMBER = 8;
        private int templateId_;
        public static final int ENTRANCE_ID_FIELD_NUMBER = 2;
        private int entranceId_;
        private byte memoizedIsInitialized;
        private static final ParentQuestRandomInfo DEFAULT_INSTANCE;
        private static final Parser<ParentQuestRandomInfo> PARSER;
        
        private ParentQuestRandomInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.factorListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private ParentQuestRandomInfo() {
            this.factorListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.factorList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ParentQuestRandomInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ParentQuestRandomInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.factorList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.factorList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 10: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.factorList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.factorList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 16: {
                            this.entranceId_ = input.readUInt32();
                            continue;
                        }
                        case 64: {
                            this.templateId_ = input.readUInt32();
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
                    this.factorList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return ParentQuestRandomInfoOuterClass.internal_static_ParentQuestRandomInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ParentQuestRandomInfoOuterClass.internal_static_ParentQuestRandomInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ParentQuestRandomInfo.class, Builder.class);
        }
        
        @Override
        public List<Integer> getFactorListList() {
            return this.factorList_;
        }
        
        @Override
        public int getFactorListCount() {
            return this.factorList_.size();
        }
        
        @Override
        public int getFactorList(final int index) {
            return this.factorList_.getInt(index);
        }
        
        @Override
        public int getTemplateId() {
            return this.templateId_;
        }
        
        @Override
        public int getEntranceId() {
            return this.entranceId_;
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
            if (this.getFactorListList().size() > 0) {
                output.writeUInt32NoTag(10);
                output.writeUInt32NoTag(this.factorListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.factorList_.size(); ++i) {
                output.writeUInt32NoTag(this.factorList_.getInt(i));
            }
            if (this.entranceId_ != 0) {
                output.writeUInt32(2, this.entranceId_);
            }
            if (this.templateId_ != 0) {
                output.writeUInt32(8, this.templateId_);
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
            int dataSize = 0;
            for (int i = 0; i < this.factorList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.factorList_.getInt(i));
            }
            size += dataSize;
            if (!this.getFactorListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.factorListMemoizedSerializedSize = dataSize;
            if (this.entranceId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.entranceId_);
            }
            if (this.templateId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.templateId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ParentQuestRandomInfo)) {
                return super.equals(obj);
            }
            final ParentQuestRandomInfo other = (ParentQuestRandomInfo)obj;
            return this.getFactorListList().equals(other.getFactorListList()) && this.getTemplateId() == other.getTemplateId() && this.getEntranceId() == other.getEntranceId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getFactorListCount() > 0) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getFactorListList().hashCode();
            }
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getTemplateId();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getEntranceId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ParentQuestRandomInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ParentQuestRandomInfo.PARSER.parseFrom(data);
        }
        
        public static ParentQuestRandomInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ParentQuestRandomInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ParentQuestRandomInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ParentQuestRandomInfo.PARSER.parseFrom(data);
        }
        
        public static ParentQuestRandomInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ParentQuestRandomInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ParentQuestRandomInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ParentQuestRandomInfo.PARSER.parseFrom(data);
        }
        
        public static ParentQuestRandomInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ParentQuestRandomInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ParentQuestRandomInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ParentQuestRandomInfo.PARSER, input);
        }
        
        public static ParentQuestRandomInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ParentQuestRandomInfo.PARSER, input, extensionRegistry);
        }
        
        public static ParentQuestRandomInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ParentQuestRandomInfo.PARSER, input);
        }
        
        public static ParentQuestRandomInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ParentQuestRandomInfo.PARSER, input, extensionRegistry);
        }
        
        public static ParentQuestRandomInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ParentQuestRandomInfo.PARSER, input);
        }
        
        public static ParentQuestRandomInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ParentQuestRandomInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ParentQuestRandomInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ParentQuestRandomInfo prototype) {
            return ParentQuestRandomInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ParentQuestRandomInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ParentQuestRandomInfo getDefaultInstance() {
            return ParentQuestRandomInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<ParentQuestRandomInfo> parser() {
            return ParentQuestRandomInfo.PARSER;
        }
        
        @Override
        public Parser<ParentQuestRandomInfo> getParserForType() {
            return ParentQuestRandomInfo.PARSER;
        }
        
        @Override
        public ParentQuestRandomInfo getDefaultInstanceForType() {
            return ParentQuestRandomInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ParentQuestRandomInfo();
            PARSER = new AbstractParser<ParentQuestRandomInfo>() {
                @Override
                public ParentQuestRandomInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ParentQuestRandomInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ParentQuestRandomInfoOrBuilder
        {
            private int bitField0_;
            private Internal.IntList factorList_;
            private int templateId_;
            private int entranceId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ParentQuestRandomInfoOuterClass.internal_static_ParentQuestRandomInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ParentQuestRandomInfoOuterClass.internal_static_ParentQuestRandomInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ParentQuestRandomInfo.class, Builder.class);
            }
            
            private Builder() {
                this.factorList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.factorList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ParentQuestRandomInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.factorList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.templateId_ = 0;
                this.entranceId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ParentQuestRandomInfoOuterClass.internal_static_ParentQuestRandomInfo_descriptor;
            }
            
            @Override
            public ParentQuestRandomInfo getDefaultInstanceForType() {
                return ParentQuestRandomInfo.getDefaultInstance();
            }
            
            @Override
            public ParentQuestRandomInfo build() {
                final ParentQuestRandomInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ParentQuestRandomInfo buildPartial() {
                final ParentQuestRandomInfo result = new ParentQuestRandomInfo(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.factorList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.factorList_ = this.factorList_;
                result.templateId_ = this.templateId_;
                result.entranceId_ = this.entranceId_;
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
                if (other instanceof ParentQuestRandomInfo) {
                    return this.mergeFrom((ParentQuestRandomInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ParentQuestRandomInfo other) {
                if (other == ParentQuestRandomInfo.getDefaultInstance()) {
                    return this;
                }
                if (!other.factorList_.isEmpty()) {
                    if (this.factorList_.isEmpty()) {
                        this.factorList_ = other.factorList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureFactorListIsMutable();
                        this.factorList_.addAll(other.factorList_);
                    }
                    this.onChanged();
                }
                if (other.getTemplateId() != 0) {
                    this.setTemplateId(other.getTemplateId());
                }
                if (other.getEntranceId() != 0) {
                    this.setEntranceId(other.getEntranceId());
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
                ParentQuestRandomInfo parsedMessage = null;
                try {
                    parsedMessage = ParentQuestRandomInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ParentQuestRandomInfo)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureFactorListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.factorList_ = GeneratedMessageV3.mutableCopy(this.factorList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getFactorListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.factorList_) : this.factorList_;
            }
            
            @Override
            public int getFactorListCount() {
                return this.factorList_.size();
            }
            
            @Override
            public int getFactorList(final int index) {
                return this.factorList_.getInt(index);
            }
            
            public Builder setFactorList(final int index, final int value) {
                this.ensureFactorListIsMutable();
                this.factorList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addFactorList(final int value) {
                this.ensureFactorListIsMutable();
                this.factorList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllFactorList(final Iterable<? extends Integer> values) {
                this.ensureFactorListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.factorList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearFactorList() {
                this.factorList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getTemplateId() {
                return this.templateId_;
            }
            
            public Builder setTemplateId(final int value) {
                this.templateId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTemplateId() {
                this.templateId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getEntranceId() {
                return this.entranceId_;
            }
            
            public Builder setEntranceId(final int value) {
                this.entranceId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearEntranceId() {
                this.entranceId_ = 0;
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
    
    public interface ParentQuestRandomInfoOrBuilder extends MessageOrBuilder
    {
        List<Integer> getFactorListList();
        
        int getFactorListCount();
        
        int getFactorList(final int p0);
        
        int getTemplateId();
        
        int getEntranceId();
    }
}
