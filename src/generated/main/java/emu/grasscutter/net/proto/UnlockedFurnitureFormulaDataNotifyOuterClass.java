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

public final class UnlockedFurnitureFormulaDataNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_UnlockedFurnitureFormulaDataNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_UnlockedFurnitureFormulaDataNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private UnlockedFurnitureFormulaDataNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return UnlockedFurnitureFormulaDataNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n(UnlockedFurnitureFormulaDataNotify.proto\"O\n\"UnlockedFurnitureFormulaDataNotify\u0012\u0019\n\u0011furniture_id_list\u0018\u000f \u0003(\r\u0012\u000e\n\u0006is_all\u0018\u000b \u0001(\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        UnlockedFurnitureFormulaDataNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_UnlockedFurnitureFormulaDataNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_UnlockedFurnitureFormulaDataNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(UnlockedFurnitureFormulaDataNotifyOuterClass.internal_static_UnlockedFurnitureFormulaDataNotify_descriptor, new String[] { "FurnitureIdList", "IsAll" });
    }
    
    public static final class UnlockedFurnitureFormulaDataNotify extends GeneratedMessageV3 implements UnlockedFurnitureFormulaDataNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int FURNITURE_ID_LIST_FIELD_NUMBER = 15;
        private Internal.IntList furnitureIdList_;
        private int furnitureIdListMemoizedSerializedSize;
        public static final int IS_ALL_FIELD_NUMBER = 11;
        private boolean isAll_;
        private byte memoizedIsInitialized;
        private static final UnlockedFurnitureFormulaDataNotify DEFAULT_INSTANCE;
        private static final Parser<UnlockedFurnitureFormulaDataNotify> PARSER;
        
        private UnlockedFurnitureFormulaDataNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.furnitureIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private UnlockedFurnitureFormulaDataNotify() {
            this.furnitureIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.furnitureIdList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new UnlockedFurnitureFormulaDataNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private UnlockedFurnitureFormulaDataNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 88: {
                            this.isAll_ = input.readBool();
                            continue;
                        }
                        case 120: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.furnitureIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.furnitureIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 122: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.furnitureIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.furnitureIdList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
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
                    this.furnitureIdList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return UnlockedFurnitureFormulaDataNotifyOuterClass.internal_static_UnlockedFurnitureFormulaDataNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return UnlockedFurnitureFormulaDataNotifyOuterClass.internal_static_UnlockedFurnitureFormulaDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(UnlockedFurnitureFormulaDataNotify.class, Builder.class);
        }
        
        @Override
        public List<Integer> getFurnitureIdListList() {
            return this.furnitureIdList_;
        }
        
        @Override
        public int getFurnitureIdListCount() {
            return this.furnitureIdList_.size();
        }
        
        @Override
        public int getFurnitureIdList(final int index) {
            return this.furnitureIdList_.getInt(index);
        }
        
        @Override
        public boolean getIsAll() {
            return this.isAll_;
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
            if (this.isAll_) {
                output.writeBool(11, this.isAll_);
            }
            if (this.getFurnitureIdListList().size() > 0) {
                output.writeUInt32NoTag(122);
                output.writeUInt32NoTag(this.furnitureIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.furnitureIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.furnitureIdList_.getInt(i));
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
            if (this.isAll_) {
                size += CodedOutputStream.computeBoolSize(11, this.isAll_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.furnitureIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.furnitureIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getFurnitureIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.furnitureIdListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UnlockedFurnitureFormulaDataNotify)) {
                return super.equals(obj);
            }
            final UnlockedFurnitureFormulaDataNotify other = (UnlockedFurnitureFormulaDataNotify)obj;
            return this.getFurnitureIdListList().equals(other.getFurnitureIdListList()) && this.getIsAll() == other.getIsAll() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getFurnitureIdListCount() > 0) {
                hash = 37 * hash + 15;
                hash = 53 * hash + this.getFurnitureIdListList().hashCode();
            }
            hash = 37 * hash + 11;
            hash = 53 * hash + Internal.hashBoolean(this.getIsAll());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static UnlockedFurnitureFormulaDataNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return UnlockedFurnitureFormulaDataNotify.PARSER.parseFrom(data);
        }
        
        public static UnlockedFurnitureFormulaDataNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return UnlockedFurnitureFormulaDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static UnlockedFurnitureFormulaDataNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return UnlockedFurnitureFormulaDataNotify.PARSER.parseFrom(data);
        }
        
        public static UnlockedFurnitureFormulaDataNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return UnlockedFurnitureFormulaDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static UnlockedFurnitureFormulaDataNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return UnlockedFurnitureFormulaDataNotify.PARSER.parseFrom(data);
        }
        
        public static UnlockedFurnitureFormulaDataNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return UnlockedFurnitureFormulaDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static UnlockedFurnitureFormulaDataNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(UnlockedFurnitureFormulaDataNotify.PARSER, input);
        }
        
        public static UnlockedFurnitureFormulaDataNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(UnlockedFurnitureFormulaDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static UnlockedFurnitureFormulaDataNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(UnlockedFurnitureFormulaDataNotify.PARSER, input);
        }
        
        public static UnlockedFurnitureFormulaDataNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(UnlockedFurnitureFormulaDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static UnlockedFurnitureFormulaDataNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(UnlockedFurnitureFormulaDataNotify.PARSER, input);
        }
        
        public static UnlockedFurnitureFormulaDataNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(UnlockedFurnitureFormulaDataNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return UnlockedFurnitureFormulaDataNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final UnlockedFurnitureFormulaDataNotify prototype) {
            return UnlockedFurnitureFormulaDataNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == UnlockedFurnitureFormulaDataNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static UnlockedFurnitureFormulaDataNotify getDefaultInstance() {
            return UnlockedFurnitureFormulaDataNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<UnlockedFurnitureFormulaDataNotify> parser() {
            return UnlockedFurnitureFormulaDataNotify.PARSER;
        }
        
        @Override
        public Parser<UnlockedFurnitureFormulaDataNotify> getParserForType() {
            return UnlockedFurnitureFormulaDataNotify.PARSER;
        }
        
        @Override
        public UnlockedFurnitureFormulaDataNotify getDefaultInstanceForType() {
            return UnlockedFurnitureFormulaDataNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new UnlockedFurnitureFormulaDataNotify();
            PARSER = new AbstractParser<UnlockedFurnitureFormulaDataNotify>() {
                @Override
                public UnlockedFurnitureFormulaDataNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new UnlockedFurnitureFormulaDataNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UnlockedFurnitureFormulaDataNotifyOrBuilder
        {
            private int bitField0_;
            private Internal.IntList furnitureIdList_;
            private boolean isAll_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return UnlockedFurnitureFormulaDataNotifyOuterClass.internal_static_UnlockedFurnitureFormulaDataNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return UnlockedFurnitureFormulaDataNotifyOuterClass.internal_static_UnlockedFurnitureFormulaDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(UnlockedFurnitureFormulaDataNotify.class, Builder.class);
            }
            
            private Builder() {
                this.furnitureIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.furnitureIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (UnlockedFurnitureFormulaDataNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.furnitureIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.isAll_ = false;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return UnlockedFurnitureFormulaDataNotifyOuterClass.internal_static_UnlockedFurnitureFormulaDataNotify_descriptor;
            }
            
            @Override
            public UnlockedFurnitureFormulaDataNotify getDefaultInstanceForType() {
                return UnlockedFurnitureFormulaDataNotify.getDefaultInstance();
            }
            
            @Override
            public UnlockedFurnitureFormulaDataNotify build() {
                final UnlockedFurnitureFormulaDataNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public UnlockedFurnitureFormulaDataNotify buildPartial() {
                final UnlockedFurnitureFormulaDataNotify result = new UnlockedFurnitureFormulaDataNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.furnitureIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.furnitureIdList_ = this.furnitureIdList_;
                result.isAll_ = this.isAll_;
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
                if (other instanceof UnlockedFurnitureFormulaDataNotify) {
                    return this.mergeFrom((UnlockedFurnitureFormulaDataNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final UnlockedFurnitureFormulaDataNotify other) {
                if (other == UnlockedFurnitureFormulaDataNotify.getDefaultInstance()) {
                    return this;
                }
                if (!other.furnitureIdList_.isEmpty()) {
                    if (this.furnitureIdList_.isEmpty()) {
                        this.furnitureIdList_ = other.furnitureIdList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureFurnitureIdListIsMutable();
                        this.furnitureIdList_.addAll(other.furnitureIdList_);
                    }
                    this.onChanged();
                }
                if (other.getIsAll()) {
                    this.setIsAll(other.getIsAll());
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
                UnlockedFurnitureFormulaDataNotify parsedMessage = null;
                try {
                    parsedMessage = UnlockedFurnitureFormulaDataNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (UnlockedFurnitureFormulaDataNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureFurnitureIdListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.furnitureIdList_ = GeneratedMessageV3.mutableCopy(this.furnitureIdList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getFurnitureIdListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.furnitureIdList_) : this.furnitureIdList_;
            }
            
            @Override
            public int getFurnitureIdListCount() {
                return this.furnitureIdList_.size();
            }
            
            @Override
            public int getFurnitureIdList(final int index) {
                return this.furnitureIdList_.getInt(index);
            }
            
            public Builder setFurnitureIdList(final int index, final int value) {
                this.ensureFurnitureIdListIsMutable();
                this.furnitureIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addFurnitureIdList(final int value) {
                this.ensureFurnitureIdListIsMutable();
                this.furnitureIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllFurnitureIdList(final Iterable<? extends Integer> values) {
                this.ensureFurnitureIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.furnitureIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearFurnitureIdList() {
                this.furnitureIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsAll() {
                return this.isAll_;
            }
            
            public Builder setIsAll(final boolean value) {
                this.isAll_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsAll() {
                this.isAll_ = false;
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
    
    public interface UnlockedFurnitureFormulaDataNotifyOrBuilder extends MessageOrBuilder
    {
        List<Integer> getFurnitureIdListList();
        
        int getFurnitureIdListCount();
        
        int getFurnitureIdList(final int p0);
        
        boolean getIsAll();
    }
}
