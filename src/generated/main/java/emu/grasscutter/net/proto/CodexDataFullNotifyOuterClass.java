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
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class CodexDataFullNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_CodexDataFullNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CodexDataFullNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private CodexDataFullNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return CodexDataFullNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019CodexDataFullNotify.proto\u001a\u0013CodexTypeData.proto\"\u0094\u0001\n\u0013CodexDataFullNotify\u0012\u001b\n\u0013Unk2700_BPKOLHOOGFO\u0018\u0004 \u0001(\r\u0012\u001b\n\u0013Unk2700_DFJJHFHHIHF\u0018\u0002 \u0003(\r\u0012\u001b\n\u0013Unk2700_HJDNBBPMOAP\u0018\u0003 \u0001(\r\u0012&\n\u000etype_data_list\u0018\u0006 \u0003(\u000b2\u000e.CodexTypeDataB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        CodexDataFullNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { CodexTypeDataOuterClass.getDescriptor() });
        internal_static_CodexDataFullNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CodexDataFullNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(CodexDataFullNotifyOuterClass.internal_static_CodexDataFullNotify_descriptor, new String[] { "Unk2700BPKOLHOOGFO", "Unk2700DFJJHFHHIHF", "Unk2700HJDNBBPMOAP", "TypeDataList" });
        CodexTypeDataOuterClass.getDescriptor();
    }
    
    public static final class CodexDataFullNotify extends GeneratedMessageV3 implements CodexDataFullNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int UNK2700_BPKOLHOOGFO_FIELD_NUMBER = 4;
        private int unk2700BPKOLHOOGFO_;
        public static final int UNK2700_DFJJHFHHIHF_FIELD_NUMBER = 2;
        private Internal.IntList unk2700DFJJHFHHIHF_;
        private int unk2700DFJJHFHHIHFMemoizedSerializedSize;
        public static final int UNK2700_HJDNBBPMOAP_FIELD_NUMBER = 3;
        private int unk2700HJDNBBPMOAP_;
        public static final int TYPE_DATA_LIST_FIELD_NUMBER = 6;
        private List<CodexTypeDataOuterClass.CodexTypeData> typeDataList_;
        private byte memoizedIsInitialized;
        private static final CodexDataFullNotify DEFAULT_INSTANCE;
        private static final Parser<CodexDataFullNotify> PARSER;
        
        private CodexDataFullNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.unk2700DFJJHFHHIHFMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private CodexDataFullNotify() {
            this.unk2700DFJJHFHHIHFMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.unk2700DFJJHFHHIHF_ = GeneratedMessageV3.emptyIntList();
            this.typeDataList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new CodexDataFullNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private CodexDataFullNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 16: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.unk2700DFJJHFHHIHF_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.unk2700DFJJHFHHIHF_.addInt(input.readUInt32());
                            continue;
                        }
                        case 18: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.unk2700DFJJHFHHIHF_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.unk2700DFJJHFHHIHF_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 24: {
                            this.unk2700HJDNBBPMOAP_ = input.readUInt32();
                            continue;
                        }
                        case 32: {
                            this.unk2700BPKOLHOOGFO_ = input.readUInt32();
                            continue;
                        }
                        case 50: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.typeDataList_ = new ArrayList<CodexTypeDataOuterClass.CodexTypeData>();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.typeDataList_.add(input.readMessage(CodexTypeDataOuterClass.CodexTypeData.parser(), extensionRegistry));
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
                    this.unk2700DFJJHFHHIHF_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.typeDataList_ = Collections.unmodifiableList((List<? extends CodexTypeDataOuterClass.CodexTypeData>)this.typeDataList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return CodexDataFullNotifyOuterClass.internal_static_CodexDataFullNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return CodexDataFullNotifyOuterClass.internal_static_CodexDataFullNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(CodexDataFullNotify.class, Builder.class);
        }
        
        @Override
        public int getUnk2700BPKOLHOOGFO() {
            return this.unk2700BPKOLHOOGFO_;
        }
        
        @Override
        public List<Integer> getUnk2700DFJJHFHHIHFList() {
            return this.unk2700DFJJHFHHIHF_;
        }
        
        @Override
        public int getUnk2700DFJJHFHHIHFCount() {
            return this.unk2700DFJJHFHHIHF_.size();
        }
        
        @Override
        public int getUnk2700DFJJHFHHIHF(final int index) {
            return this.unk2700DFJJHFHHIHF_.getInt(index);
        }
        
        @Override
        public int getUnk2700HJDNBBPMOAP() {
            return this.unk2700HJDNBBPMOAP_;
        }
        
        @Override
        public List<CodexTypeDataOuterClass.CodexTypeData> getTypeDataListList() {
            return this.typeDataList_;
        }
        
        @Override
        public List<? extends CodexTypeDataOuterClass.CodexTypeDataOrBuilder> getTypeDataListOrBuilderList() {
            return this.typeDataList_;
        }
        
        @Override
        public int getTypeDataListCount() {
            return this.typeDataList_.size();
        }
        
        @Override
        public CodexTypeDataOuterClass.CodexTypeData getTypeDataList(final int index) {
            return this.typeDataList_.get(index);
        }
        
        @Override
        public CodexTypeDataOuterClass.CodexTypeDataOrBuilder getTypeDataListOrBuilder(final int index) {
            return this.typeDataList_.get(index);
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
            if (this.getUnk2700DFJJHFHHIHFList().size() > 0) {
                output.writeUInt32NoTag(18);
                output.writeUInt32NoTag(this.unk2700DFJJHFHHIHFMemoizedSerializedSize);
            }
            for (int i = 0; i < this.unk2700DFJJHFHHIHF_.size(); ++i) {
                output.writeUInt32NoTag(this.unk2700DFJJHFHHIHF_.getInt(i));
            }
            if (this.unk2700HJDNBBPMOAP_ != 0) {
                output.writeUInt32(3, this.unk2700HJDNBBPMOAP_);
            }
            if (this.unk2700BPKOLHOOGFO_ != 0) {
                output.writeUInt32(4, this.unk2700BPKOLHOOGFO_);
            }
            for (int i = 0; i < this.typeDataList_.size(); ++i) {
                output.writeMessage(6, this.typeDataList_.get(i));
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
            for (int i = 0; i < this.unk2700DFJJHFHHIHF_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.unk2700DFJJHFHHIHF_.getInt(i));
            }
            size += dataSize;
            if (!this.getUnk2700DFJJHFHHIHFList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.unk2700DFJJHFHHIHFMemoizedSerializedSize = dataSize;
            if (this.unk2700HJDNBBPMOAP_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.unk2700HJDNBBPMOAP_);
            }
            if (this.unk2700BPKOLHOOGFO_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.unk2700BPKOLHOOGFO_);
            }
            for (int j = 0; j < this.typeDataList_.size(); ++j) {
                size += CodedOutputStream.computeMessageSize(6, this.typeDataList_.get(j));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CodexDataFullNotify)) {
                return super.equals(obj);
            }
            final CodexDataFullNotify other = (CodexDataFullNotify)obj;
            return this.getUnk2700BPKOLHOOGFO() == other.getUnk2700BPKOLHOOGFO() && this.getUnk2700DFJJHFHHIHFList().equals(other.getUnk2700DFJJHFHHIHFList()) && this.getUnk2700HJDNBBPMOAP() == other.getUnk2700HJDNBBPMOAP() && this.getTypeDataListList().equals(other.getTypeDataListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getUnk2700BPKOLHOOGFO();
            if (this.getUnk2700DFJJHFHHIHFCount() > 0) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getUnk2700DFJJHFHHIHFList().hashCode();
            }
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getUnk2700HJDNBBPMOAP();
            if (this.getTypeDataListCount() > 0) {
                hash = 37 * hash + 6;
                hash = 53 * hash + this.getTypeDataListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static CodexDataFullNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return CodexDataFullNotify.PARSER.parseFrom(data);
        }
        
        public static CodexDataFullNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CodexDataFullNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CodexDataFullNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return CodexDataFullNotify.PARSER.parseFrom(data);
        }
        
        public static CodexDataFullNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CodexDataFullNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CodexDataFullNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return CodexDataFullNotify.PARSER.parseFrom(data);
        }
        
        public static CodexDataFullNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CodexDataFullNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CodexDataFullNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CodexDataFullNotify.PARSER, input);
        }
        
        public static CodexDataFullNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CodexDataFullNotify.PARSER, input, extensionRegistry);
        }
        
        public static CodexDataFullNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CodexDataFullNotify.PARSER, input);
        }
        
        public static CodexDataFullNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CodexDataFullNotify.PARSER, input, extensionRegistry);
        }
        
        public static CodexDataFullNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CodexDataFullNotify.PARSER, input);
        }
        
        public static CodexDataFullNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CodexDataFullNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return CodexDataFullNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final CodexDataFullNotify prototype) {
            return CodexDataFullNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == CodexDataFullNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static CodexDataFullNotify getDefaultInstance() {
            return CodexDataFullNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<CodexDataFullNotify> parser() {
            return CodexDataFullNotify.PARSER;
        }
        
        @Override
        public Parser<CodexDataFullNotify> getParserForType() {
            return CodexDataFullNotify.PARSER;
        }
        
        @Override
        public CodexDataFullNotify getDefaultInstanceForType() {
            return CodexDataFullNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new CodexDataFullNotify();
            PARSER = new AbstractParser<CodexDataFullNotify>() {
                @Override
                public CodexDataFullNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new CodexDataFullNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CodexDataFullNotifyOrBuilder
        {
            private int bitField0_;
            private int unk2700BPKOLHOOGFO_;
            private Internal.IntList unk2700DFJJHFHHIHF_;
            private int unk2700HJDNBBPMOAP_;
            private List<CodexTypeDataOuterClass.CodexTypeData> typeDataList_;
            private RepeatedFieldBuilderV3<CodexTypeDataOuterClass.CodexTypeData, CodexTypeDataOuterClass.CodexTypeData.Builder, CodexTypeDataOuterClass.CodexTypeDataOrBuilder> typeDataListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return CodexDataFullNotifyOuterClass.internal_static_CodexDataFullNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return CodexDataFullNotifyOuterClass.internal_static_CodexDataFullNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(CodexDataFullNotify.class, Builder.class);
            }
            
            private Builder() {
                this.unk2700DFJJHFHHIHF_ = GeneratedMessageV3.emptyIntList();
                this.typeDataList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.unk2700DFJJHFHHIHF_ = GeneratedMessageV3.emptyIntList();
                this.typeDataList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (CodexDataFullNotify.alwaysUseFieldBuilders) {
                    this.getTypeDataListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.unk2700BPKOLHOOGFO_ = 0;
                this.unk2700DFJJHFHHIHF_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.unk2700HJDNBBPMOAP_ = 0;
                if (this.typeDataListBuilder_ == null) {
                    this.typeDataList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                else {
                    this.typeDataListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return CodexDataFullNotifyOuterClass.internal_static_CodexDataFullNotify_descriptor;
            }
            
            @Override
            public CodexDataFullNotify getDefaultInstanceForType() {
                return CodexDataFullNotify.getDefaultInstance();
            }
            
            @Override
            public CodexDataFullNotify build() {
                final CodexDataFullNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public CodexDataFullNotify buildPartial() {
                final CodexDataFullNotify result = new CodexDataFullNotify(this);
                final int from_bitField0_ = this.bitField0_;
                result.unk2700BPKOLHOOGFO_ = this.unk2700BPKOLHOOGFO_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.unk2700DFJJHFHHIHF_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.unk2700DFJJHFHHIHF_ = this.unk2700DFJJHFHHIHF_;
                result.unk2700HJDNBBPMOAP_ = this.unk2700HJDNBBPMOAP_;
                if (this.typeDataListBuilder_ == null) {
                    if ((this.bitField0_ & 0x2) != 0x0) {
                        this.typeDataList_ = Collections.unmodifiableList((List<? extends CodexTypeDataOuterClass.CodexTypeData>)this.typeDataList_);
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    result.typeDataList_ = this.typeDataList_;
                }
                else {
                    result.typeDataList_ = this.typeDataListBuilder_.build();
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
                if (other instanceof CodexDataFullNotify) {
                    return this.mergeFrom((CodexDataFullNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final CodexDataFullNotify other) {
                if (other == CodexDataFullNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getUnk2700BPKOLHOOGFO() != 0) {
                    this.setUnk2700BPKOLHOOGFO(other.getUnk2700BPKOLHOOGFO());
                }
                if (!other.unk2700DFJJHFHHIHF_.isEmpty()) {
                    if (this.unk2700DFJJHFHHIHF_.isEmpty()) {
                        this.unk2700DFJJHFHHIHF_ = other.unk2700DFJJHFHHIHF_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureUnk2700DFJJHFHHIHFIsMutable();
                        this.unk2700DFJJHFHHIHF_.addAll(other.unk2700DFJJHFHHIHF_);
                    }
                    this.onChanged();
                }
                if (other.getUnk2700HJDNBBPMOAP() != 0) {
                    this.setUnk2700HJDNBBPMOAP(other.getUnk2700HJDNBBPMOAP());
                }
                if (this.typeDataListBuilder_ == null) {
                    if (!other.typeDataList_.isEmpty()) {
                        if (this.typeDataList_.isEmpty()) {
                            this.typeDataList_ = other.typeDataList_;
                            this.bitField0_ &= 0xFFFFFFFD;
                        }
                        else {
                            this.ensureTypeDataListIsMutable();
                            this.typeDataList_.addAll(other.typeDataList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.typeDataList_.isEmpty()) {
                    if (this.typeDataListBuilder_.isEmpty()) {
                        this.typeDataListBuilder_.dispose();
                        this.typeDataListBuilder_ = null;
                        this.typeDataList_ = other.typeDataList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                        this.typeDataListBuilder_ = (CodexDataFullNotify.alwaysUseFieldBuilders ? this.getTypeDataListFieldBuilder() : null);
                    }
                    else {
                        this.typeDataListBuilder_.addAllMessages(other.typeDataList_);
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
                CodexDataFullNotify parsedMessage = null;
                try {
                    parsedMessage = CodexDataFullNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (CodexDataFullNotify)e.getUnfinishedMessage();
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
            public int getUnk2700BPKOLHOOGFO() {
                return this.unk2700BPKOLHOOGFO_;
            }
            
            public Builder setUnk2700BPKOLHOOGFO(final int value) {
                this.unk2700BPKOLHOOGFO_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700BPKOLHOOGFO() {
                this.unk2700BPKOLHOOGFO_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureUnk2700DFJJHFHHIHFIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.unk2700DFJJHFHHIHF_ = GeneratedMessageV3.mutableCopy(this.unk2700DFJJHFHHIHF_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getUnk2700DFJJHFHHIHFList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.unk2700DFJJHFHHIHF_) : this.unk2700DFJJHFHHIHF_;
            }
            
            @Override
            public int getUnk2700DFJJHFHHIHFCount() {
                return this.unk2700DFJJHFHHIHF_.size();
            }
            
            @Override
            public int getUnk2700DFJJHFHHIHF(final int index) {
                return this.unk2700DFJJHFHHIHF_.getInt(index);
            }
            
            public Builder setUnk2700DFJJHFHHIHF(final int index, final int value) {
                this.ensureUnk2700DFJJHFHHIHFIsMutable();
                this.unk2700DFJJHFHHIHF_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addUnk2700DFJJHFHHIHF(final int value) {
                this.ensureUnk2700DFJJHFHHIHFIsMutable();
                this.unk2700DFJJHFHHIHF_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllUnk2700DFJJHFHHIHF(final Iterable<? extends Integer> values) {
                this.ensureUnk2700DFJJHFHHIHFIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.unk2700DFJJHFHHIHF_);
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700DFJJHFHHIHF() {
                this.unk2700DFJJHFHHIHF_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUnk2700HJDNBBPMOAP() {
                return this.unk2700HJDNBBPMOAP_;
            }
            
            public Builder setUnk2700HJDNBBPMOAP(final int value) {
                this.unk2700HJDNBBPMOAP_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700HJDNBBPMOAP() {
                this.unk2700HJDNBBPMOAP_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureTypeDataListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.typeDataList_ = new ArrayList<CodexTypeDataOuterClass.CodexTypeData>(this.typeDataList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<CodexTypeDataOuterClass.CodexTypeData> getTypeDataListList() {
                if (this.typeDataListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends CodexTypeDataOuterClass.CodexTypeData>)this.typeDataList_);
                }
                return this.typeDataListBuilder_.getMessageList();
            }
            
            @Override
            public int getTypeDataListCount() {
                if (this.typeDataListBuilder_ == null) {
                    return this.typeDataList_.size();
                }
                return this.typeDataListBuilder_.getCount();
            }
            
            @Override
            public CodexTypeDataOuterClass.CodexTypeData getTypeDataList(final int index) {
                if (this.typeDataListBuilder_ == null) {
                    return this.typeDataList_.get(index);
                }
                return this.typeDataListBuilder_.getMessage(index);
            }
            
            public Builder setTypeDataList(final int index, final CodexTypeDataOuterClass.CodexTypeData value) {
                if (this.typeDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureTypeDataListIsMutable();
                    this.typeDataList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.typeDataListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setTypeDataList(final int index, final CodexTypeDataOuterClass.CodexTypeData.Builder builderForValue) {
                if (this.typeDataListBuilder_ == null) {
                    this.ensureTypeDataListIsMutable();
                    this.typeDataList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.typeDataListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addTypeDataList(final CodexTypeDataOuterClass.CodexTypeData value) {
                if (this.typeDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureTypeDataListIsMutable();
                    this.typeDataList_.add(value);
                    this.onChanged();
                }
                else {
                    this.typeDataListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addTypeDataList(final int index, final CodexTypeDataOuterClass.CodexTypeData value) {
                if (this.typeDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureTypeDataListIsMutable();
                    this.typeDataList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.typeDataListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addTypeDataList(final CodexTypeDataOuterClass.CodexTypeData.Builder builderForValue) {
                if (this.typeDataListBuilder_ == null) {
                    this.ensureTypeDataListIsMutable();
                    this.typeDataList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.typeDataListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addTypeDataList(final int index, final CodexTypeDataOuterClass.CodexTypeData.Builder builderForValue) {
                if (this.typeDataListBuilder_ == null) {
                    this.ensureTypeDataListIsMutable();
                    this.typeDataList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.typeDataListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllTypeDataList(final Iterable<? extends CodexTypeDataOuterClass.CodexTypeData> values) {
                if (this.typeDataListBuilder_ == null) {
                    this.ensureTypeDataListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.typeDataList_);
                    this.onChanged();
                }
                else {
                    this.typeDataListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearTypeDataList() {
                if (this.typeDataListBuilder_ == null) {
                    this.typeDataList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                    this.onChanged();
                }
                else {
                    this.typeDataListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeTypeDataList(final int index) {
                if (this.typeDataListBuilder_ == null) {
                    this.ensureTypeDataListIsMutable();
                    this.typeDataList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.typeDataListBuilder_.remove(index);
                }
                return this;
            }
            
            public CodexTypeDataOuterClass.CodexTypeData.Builder getTypeDataListBuilder(final int index) {
                return this.getTypeDataListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public CodexTypeDataOuterClass.CodexTypeDataOrBuilder getTypeDataListOrBuilder(final int index) {
                if (this.typeDataListBuilder_ == null) {
                    return this.typeDataList_.get(index);
                }
                return this.typeDataListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends CodexTypeDataOuterClass.CodexTypeDataOrBuilder> getTypeDataListOrBuilderList() {
                if (this.typeDataListBuilder_ != null) {
                    return this.typeDataListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends CodexTypeDataOuterClass.CodexTypeDataOrBuilder>)this.typeDataList_);
            }
            
            public CodexTypeDataOuterClass.CodexTypeData.Builder addTypeDataListBuilder() {
                return this.getTypeDataListFieldBuilder().addBuilder(CodexTypeDataOuterClass.CodexTypeData.getDefaultInstance());
            }
            
            public CodexTypeDataOuterClass.CodexTypeData.Builder addTypeDataListBuilder(final int index) {
                return this.getTypeDataListFieldBuilder().addBuilder(index, CodexTypeDataOuterClass.CodexTypeData.getDefaultInstance());
            }
            
            public List<CodexTypeDataOuterClass.CodexTypeData.Builder> getTypeDataListBuilderList() {
                return this.getTypeDataListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<CodexTypeDataOuterClass.CodexTypeData, CodexTypeDataOuterClass.CodexTypeData.Builder, CodexTypeDataOuterClass.CodexTypeDataOrBuilder> getTypeDataListFieldBuilder() {
                if (this.typeDataListBuilder_ == null) {
                    this.typeDataListBuilder_ = new RepeatedFieldBuilderV3<CodexTypeDataOuterClass.CodexTypeData, CodexTypeDataOuterClass.CodexTypeData.Builder, CodexTypeDataOuterClass.CodexTypeDataOrBuilder>(this.typeDataList_, (this.bitField0_ & 0x2) != 0x0, this.getParentForChildren(), this.isClean());
                    this.typeDataList_ = null;
                }
                return this.typeDataListBuilder_;
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
    
    public interface CodexDataFullNotifyOrBuilder extends MessageOrBuilder
    {
        int getUnk2700BPKOLHOOGFO();
        
        List<Integer> getUnk2700DFJJHFHHIHFList();
        
        int getUnk2700DFJJHFHHIHFCount();
        
        int getUnk2700DFJJHFHHIHF(final int p0);
        
        int getUnk2700HJDNBBPMOAP();
        
        List<CodexTypeDataOuterClass.CodexTypeData> getTypeDataListList();
        
        CodexTypeDataOuterClass.CodexTypeData getTypeDataList(final int p0);
        
        int getTypeDataListCount();
        
        List<? extends CodexTypeDataOuterClass.CodexTypeDataOrBuilder> getTypeDataListOrBuilderList();
        
        CodexTypeDataOuterClass.CodexTypeDataOrBuilder getTypeDataListOrBuilder(final int p0);
    }
}
