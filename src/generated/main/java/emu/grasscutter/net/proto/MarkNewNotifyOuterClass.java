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

public final class MarkNewNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_MarkNewNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MarkNewNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private MarkNewNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MarkNewNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0013MarkNewNotify.proto\"7\n\rMarkNewNotify\u0012\u000f\n\u0007id_list\u0018\u0007 \u0003(\r\u0012\u0015\n\rmark_new_type\u0018\u000b \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MarkNewNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_MarkNewNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MarkNewNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MarkNewNotifyOuterClass.internal_static_MarkNewNotify_descriptor, new String[] { "IdList", "MarkNewType" });
    }
    
    public static final class MarkNewNotify extends GeneratedMessageV3 implements MarkNewNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ID_LIST_FIELD_NUMBER = 7;
        private Internal.IntList idList_;
        private int idListMemoizedSerializedSize;
        public static final int MARK_NEW_TYPE_FIELD_NUMBER = 11;
        private int markNewType_;
        private byte memoizedIsInitialized;
        private static final MarkNewNotify DEFAULT_INSTANCE;
        private static final Parser<MarkNewNotify> PARSER;
        
        private MarkNewNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.idListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private MarkNewNotify() {
            this.idListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.idList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new MarkNewNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private MarkNewNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 56: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.idList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.idList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 58: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.idList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.idList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 88: {
                            this.markNewType_ = input.readUInt32();
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
                    this.idList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return MarkNewNotifyOuterClass.internal_static_MarkNewNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MarkNewNotifyOuterClass.internal_static_MarkNewNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(MarkNewNotify.class, Builder.class);
        }
        
        @Override
        public List<Integer> getIdListList() {
            return this.idList_;
        }
        
        @Override
        public int getIdListCount() {
            return this.idList_.size();
        }
        
        @Override
        public int getIdList(final int index) {
            return this.idList_.getInt(index);
        }
        
        @Override
        public int getMarkNewType() {
            return this.markNewType_;
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
            if (this.getIdListList().size() > 0) {
                output.writeUInt32NoTag(58);
                output.writeUInt32NoTag(this.idListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.idList_.size(); ++i) {
                output.writeUInt32NoTag(this.idList_.getInt(i));
            }
            if (this.markNewType_ != 0) {
                output.writeUInt32(11, this.markNewType_);
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
            for (int i = 0; i < this.idList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.idList_.getInt(i));
            }
            size += dataSize;
            if (!this.getIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.idListMemoizedSerializedSize = dataSize;
            if (this.markNewType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.markNewType_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MarkNewNotify)) {
                return super.equals(obj);
            }
            final MarkNewNotify other = (MarkNewNotify)obj;
            return this.getIdListList().equals(other.getIdListList()) && this.getMarkNewType() == other.getMarkNewType() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getIdListCount() > 0) {
                hash = 37 * hash + 7;
                hash = 53 * hash + this.getIdListList().hashCode();
            }
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getMarkNewType();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static MarkNewNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return MarkNewNotify.PARSER.parseFrom(data);
        }
        
        public static MarkNewNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MarkNewNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MarkNewNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return MarkNewNotify.PARSER.parseFrom(data);
        }
        
        public static MarkNewNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MarkNewNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MarkNewNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return MarkNewNotify.PARSER.parseFrom(data);
        }
        
        public static MarkNewNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MarkNewNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MarkNewNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MarkNewNotify.PARSER, input);
        }
        
        public static MarkNewNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MarkNewNotify.PARSER, input, extensionRegistry);
        }
        
        public static MarkNewNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MarkNewNotify.PARSER, input);
        }
        
        public static MarkNewNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MarkNewNotify.PARSER, input, extensionRegistry);
        }
        
        public static MarkNewNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MarkNewNotify.PARSER, input);
        }
        
        public static MarkNewNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MarkNewNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return MarkNewNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final MarkNewNotify prototype) {
            return MarkNewNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == MarkNewNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static MarkNewNotify getDefaultInstance() {
            return MarkNewNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<MarkNewNotify> parser() {
            return MarkNewNotify.PARSER;
        }
        
        @Override
        public Parser<MarkNewNotify> getParserForType() {
            return MarkNewNotify.PARSER;
        }
        
        @Override
        public MarkNewNotify getDefaultInstanceForType() {
            return MarkNewNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new MarkNewNotify();
            PARSER = new AbstractParser<MarkNewNotify>() {
                @Override
                public MarkNewNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new MarkNewNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MarkNewNotifyOrBuilder
        {
            private int bitField0_;
            private Internal.IntList idList_;
            private int markNewType_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return MarkNewNotifyOuterClass.internal_static_MarkNewNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return MarkNewNotifyOuterClass.internal_static_MarkNewNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(MarkNewNotify.class, Builder.class);
            }
            
            private Builder() {
                this.idList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.idList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (MarkNewNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.idList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.markNewType_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return MarkNewNotifyOuterClass.internal_static_MarkNewNotify_descriptor;
            }
            
            @Override
            public MarkNewNotify getDefaultInstanceForType() {
                return MarkNewNotify.getDefaultInstance();
            }
            
            @Override
            public MarkNewNotify build() {
                final MarkNewNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public MarkNewNotify buildPartial() {
                final MarkNewNotify result = new MarkNewNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.idList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.idList_ = this.idList_;
                result.markNewType_ = this.markNewType_;
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
                if (other instanceof MarkNewNotify) {
                    return this.mergeFrom((MarkNewNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final MarkNewNotify other) {
                if (other == MarkNewNotify.getDefaultInstance()) {
                    return this;
                }
                if (!other.idList_.isEmpty()) {
                    if (this.idList_.isEmpty()) {
                        this.idList_ = other.idList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureIdListIsMutable();
                        this.idList_.addAll(other.idList_);
                    }
                    this.onChanged();
                }
                if (other.getMarkNewType() != 0) {
                    this.setMarkNewType(other.getMarkNewType());
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
                MarkNewNotify parsedMessage = null;
                try {
                    parsedMessage = MarkNewNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (MarkNewNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureIdListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.idList_ = GeneratedMessageV3.mutableCopy(this.idList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getIdListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.idList_) : this.idList_;
            }
            
            @Override
            public int getIdListCount() {
                return this.idList_.size();
            }
            
            @Override
            public int getIdList(final int index) {
                return this.idList_.getInt(index);
            }
            
            public Builder setIdList(final int index, final int value) {
                this.ensureIdListIsMutable();
                this.idList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addIdList(final int value) {
                this.ensureIdListIsMutable();
                this.idList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllIdList(final Iterable<? extends Integer> values) {
                this.ensureIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.idList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearIdList() {
                this.idList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getMarkNewType() {
                return this.markNewType_;
            }
            
            public Builder setMarkNewType(final int value) {
                this.markNewType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMarkNewType() {
                this.markNewType_ = 0;
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
    
    public interface MarkNewNotifyOrBuilder extends MessageOrBuilder
    {
        List<Integer> getIdListList();
        
        int getIdListCount();
        
        int getIdList(final int p0);
        
        int getMarkNewType();
    }
}
