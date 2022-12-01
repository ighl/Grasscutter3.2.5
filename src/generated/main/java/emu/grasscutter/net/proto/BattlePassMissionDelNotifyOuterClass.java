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

public final class BattlePassMissionDelNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_BattlePassMissionDelNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_BattlePassMissionDelNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private BattlePassMissionDelNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return BattlePassMissionDelNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n BattlePassMissionDelNotify.proto\"9\n\u001aBattlePassMissionDelNotify\u0012\u001b\n\u0013del_mission_id_list\u0018\n \u0003(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        BattlePassMissionDelNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_BattlePassMissionDelNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_BattlePassMissionDelNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(BattlePassMissionDelNotifyOuterClass.internal_static_BattlePassMissionDelNotify_descriptor, new String[] { "DelMissionIdList" });
    }
    
    public static final class BattlePassMissionDelNotify extends GeneratedMessageV3 implements BattlePassMissionDelNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int DEL_MISSION_ID_LIST_FIELD_NUMBER = 10;
        private Internal.IntList delMissionIdList_;
        private int delMissionIdListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final BattlePassMissionDelNotify DEFAULT_INSTANCE;
        private static final Parser<BattlePassMissionDelNotify> PARSER;
        
        private BattlePassMissionDelNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.delMissionIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private BattlePassMissionDelNotify() {
            this.delMissionIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.delMissionIdList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new BattlePassMissionDelNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private BattlePassMissionDelNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 80: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.delMissionIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.delMissionIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 82: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.delMissionIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.delMissionIdList_.addInt(input.readUInt32());
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
                    this.delMissionIdList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return BattlePassMissionDelNotifyOuterClass.internal_static_BattlePassMissionDelNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return BattlePassMissionDelNotifyOuterClass.internal_static_BattlePassMissionDelNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(BattlePassMissionDelNotify.class, Builder.class);
        }
        
        @Override
        public List<Integer> getDelMissionIdListList() {
            return this.delMissionIdList_;
        }
        
        @Override
        public int getDelMissionIdListCount() {
            return this.delMissionIdList_.size();
        }
        
        @Override
        public int getDelMissionIdList(final int index) {
            return this.delMissionIdList_.getInt(index);
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
            if (this.getDelMissionIdListList().size() > 0) {
                output.writeUInt32NoTag(82);
                output.writeUInt32NoTag(this.delMissionIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.delMissionIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.delMissionIdList_.getInt(i));
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
            for (int i = 0; i < this.delMissionIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.delMissionIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getDelMissionIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.delMissionIdListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BattlePassMissionDelNotify)) {
                return super.equals(obj);
            }
            final BattlePassMissionDelNotify other = (BattlePassMissionDelNotify)obj;
            return this.getDelMissionIdListList().equals(other.getDelMissionIdListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getDelMissionIdListCount() > 0) {
                hash = 37 * hash + 10;
                hash = 53 * hash + this.getDelMissionIdListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static BattlePassMissionDelNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return BattlePassMissionDelNotify.PARSER.parseFrom(data);
        }
        
        public static BattlePassMissionDelNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BattlePassMissionDelNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BattlePassMissionDelNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return BattlePassMissionDelNotify.PARSER.parseFrom(data);
        }
        
        public static BattlePassMissionDelNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BattlePassMissionDelNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BattlePassMissionDelNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return BattlePassMissionDelNotify.PARSER.parseFrom(data);
        }
        
        public static BattlePassMissionDelNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BattlePassMissionDelNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BattlePassMissionDelNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassMissionDelNotify.PARSER, input);
        }
        
        public static BattlePassMissionDelNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassMissionDelNotify.PARSER, input, extensionRegistry);
        }
        
        public static BattlePassMissionDelNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BattlePassMissionDelNotify.PARSER, input);
        }
        
        public static BattlePassMissionDelNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BattlePassMissionDelNotify.PARSER, input, extensionRegistry);
        }
        
        public static BattlePassMissionDelNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassMissionDelNotify.PARSER, input);
        }
        
        public static BattlePassMissionDelNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassMissionDelNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return BattlePassMissionDelNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final BattlePassMissionDelNotify prototype) {
            return BattlePassMissionDelNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == BattlePassMissionDelNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static BattlePassMissionDelNotify getDefaultInstance() {
            return BattlePassMissionDelNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<BattlePassMissionDelNotify> parser() {
            return BattlePassMissionDelNotify.PARSER;
        }
        
        @Override
        public Parser<BattlePassMissionDelNotify> getParserForType() {
            return BattlePassMissionDelNotify.PARSER;
        }
        
        @Override
        public BattlePassMissionDelNotify getDefaultInstanceForType() {
            return BattlePassMissionDelNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new BattlePassMissionDelNotify();
            PARSER = new AbstractParser<BattlePassMissionDelNotify>() {
                @Override
                public BattlePassMissionDelNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new BattlePassMissionDelNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BattlePassMissionDelNotifyOrBuilder
        {
            private int bitField0_;
            private Internal.IntList delMissionIdList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return BattlePassMissionDelNotifyOuterClass.internal_static_BattlePassMissionDelNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return BattlePassMissionDelNotifyOuterClass.internal_static_BattlePassMissionDelNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(BattlePassMissionDelNotify.class, Builder.class);
            }
            
            private Builder() {
                this.delMissionIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.delMissionIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (BattlePassMissionDelNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.delMissionIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return BattlePassMissionDelNotifyOuterClass.internal_static_BattlePassMissionDelNotify_descriptor;
            }
            
            @Override
            public BattlePassMissionDelNotify getDefaultInstanceForType() {
                return BattlePassMissionDelNotify.getDefaultInstance();
            }
            
            @Override
            public BattlePassMissionDelNotify build() {
                final BattlePassMissionDelNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public BattlePassMissionDelNotify buildPartial() {
                final BattlePassMissionDelNotify result = new BattlePassMissionDelNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.delMissionIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.delMissionIdList_ = this.delMissionIdList_;
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
                if (other instanceof BattlePassMissionDelNotify) {
                    return this.mergeFrom((BattlePassMissionDelNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final BattlePassMissionDelNotify other) {
                if (other == BattlePassMissionDelNotify.getDefaultInstance()) {
                    return this;
                }
                if (!other.delMissionIdList_.isEmpty()) {
                    if (this.delMissionIdList_.isEmpty()) {
                        this.delMissionIdList_ = other.delMissionIdList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureDelMissionIdListIsMutable();
                        this.delMissionIdList_.addAll(other.delMissionIdList_);
                    }
                    this.onChanged();
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
                BattlePassMissionDelNotify parsedMessage = null;
                try {
                    parsedMessage = BattlePassMissionDelNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (BattlePassMissionDelNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureDelMissionIdListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.delMissionIdList_ = GeneratedMessageV3.mutableCopy(this.delMissionIdList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getDelMissionIdListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.delMissionIdList_) : this.delMissionIdList_;
            }
            
            @Override
            public int getDelMissionIdListCount() {
                return this.delMissionIdList_.size();
            }
            
            @Override
            public int getDelMissionIdList(final int index) {
                return this.delMissionIdList_.getInt(index);
            }
            
            public Builder setDelMissionIdList(final int index, final int value) {
                this.ensureDelMissionIdListIsMutable();
                this.delMissionIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addDelMissionIdList(final int value) {
                this.ensureDelMissionIdListIsMutable();
                this.delMissionIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllDelMissionIdList(final Iterable<? extends Integer> values) {
                this.ensureDelMissionIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.delMissionIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearDelMissionIdList() {
                this.delMissionIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
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
    
    public interface BattlePassMissionDelNotifyOrBuilder extends MessageOrBuilder
    {
        List<Integer> getDelMissionIdListList();
        
        int getDelMissionIdListCount();
        
        int getDelMissionIdList(final int p0);
    }
}
