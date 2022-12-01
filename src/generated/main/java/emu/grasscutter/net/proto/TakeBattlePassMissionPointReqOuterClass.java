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

public final class TakeBattlePassMissionPointReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_TakeBattlePassMissionPointReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_TakeBattlePassMissionPointReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private TakeBattlePassMissionPointReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return TakeBattlePassMissionPointReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n#TakeBattlePassMissionPointReq.proto\"8\n\u001dTakeBattlePassMissionPointReq\u0012\u0017\n\u000fmission_id_list\u0018\u0005 \u0003(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        TakeBattlePassMissionPointReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_TakeBattlePassMissionPointReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_TakeBattlePassMissionPointReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(TakeBattlePassMissionPointReqOuterClass.internal_static_TakeBattlePassMissionPointReq_descriptor, new String[] { "MissionIdList" });
    }
    
    public static final class TakeBattlePassMissionPointReq extends GeneratedMessageV3 implements TakeBattlePassMissionPointReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int MISSION_ID_LIST_FIELD_NUMBER = 5;
        private Internal.IntList missionIdList_;
        private int missionIdListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final TakeBattlePassMissionPointReq DEFAULT_INSTANCE;
        private static final Parser<TakeBattlePassMissionPointReq> PARSER;
        
        private TakeBattlePassMissionPointReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.missionIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private TakeBattlePassMissionPointReq() {
            this.missionIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.missionIdList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new TakeBattlePassMissionPointReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private TakeBattlePassMissionPointReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 40: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.missionIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.missionIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 42: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.missionIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.missionIdList_.addInt(input.readUInt32());
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
                    this.missionIdList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return TakeBattlePassMissionPointReqOuterClass.internal_static_TakeBattlePassMissionPointReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return TakeBattlePassMissionPointReqOuterClass.internal_static_TakeBattlePassMissionPointReq_fieldAccessorTable.ensureFieldAccessorsInitialized(TakeBattlePassMissionPointReq.class, Builder.class);
        }
        
        @Override
        public List<Integer> getMissionIdListList() {
            return this.missionIdList_;
        }
        
        @Override
        public int getMissionIdListCount() {
            return this.missionIdList_.size();
        }
        
        @Override
        public int getMissionIdList(final int index) {
            return this.missionIdList_.getInt(index);
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
            if (this.getMissionIdListList().size() > 0) {
                output.writeUInt32NoTag(42);
                output.writeUInt32NoTag(this.missionIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.missionIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.missionIdList_.getInt(i));
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
            for (int i = 0; i < this.missionIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.missionIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getMissionIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.missionIdListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TakeBattlePassMissionPointReq)) {
                return super.equals(obj);
            }
            final TakeBattlePassMissionPointReq other = (TakeBattlePassMissionPointReq)obj;
            return this.getMissionIdListList().equals(other.getMissionIdListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getMissionIdListCount() > 0) {
                hash = 37 * hash + 5;
                hash = 53 * hash + this.getMissionIdListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static TakeBattlePassMissionPointReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return TakeBattlePassMissionPointReq.PARSER.parseFrom(data);
        }
        
        public static TakeBattlePassMissionPointReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TakeBattlePassMissionPointReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TakeBattlePassMissionPointReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return TakeBattlePassMissionPointReq.PARSER.parseFrom(data);
        }
        
        public static TakeBattlePassMissionPointReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TakeBattlePassMissionPointReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TakeBattlePassMissionPointReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return TakeBattlePassMissionPointReq.PARSER.parseFrom(data);
        }
        
        public static TakeBattlePassMissionPointReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TakeBattlePassMissionPointReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TakeBattlePassMissionPointReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeBattlePassMissionPointReq.PARSER, input);
        }
        
        public static TakeBattlePassMissionPointReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeBattlePassMissionPointReq.PARSER, input, extensionRegistry);
        }
        
        public static TakeBattlePassMissionPointReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TakeBattlePassMissionPointReq.PARSER, input);
        }
        
        public static TakeBattlePassMissionPointReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TakeBattlePassMissionPointReq.PARSER, input, extensionRegistry);
        }
        
        public static TakeBattlePassMissionPointReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeBattlePassMissionPointReq.PARSER, input);
        }
        
        public static TakeBattlePassMissionPointReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeBattlePassMissionPointReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return TakeBattlePassMissionPointReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final TakeBattlePassMissionPointReq prototype) {
            return TakeBattlePassMissionPointReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == TakeBattlePassMissionPointReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static TakeBattlePassMissionPointReq getDefaultInstance() {
            return TakeBattlePassMissionPointReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<TakeBattlePassMissionPointReq> parser() {
            return TakeBattlePassMissionPointReq.PARSER;
        }
        
        @Override
        public Parser<TakeBattlePassMissionPointReq> getParserForType() {
            return TakeBattlePassMissionPointReq.PARSER;
        }
        
        @Override
        public TakeBattlePassMissionPointReq getDefaultInstanceForType() {
            return TakeBattlePassMissionPointReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new TakeBattlePassMissionPointReq();
            PARSER = new AbstractParser<TakeBattlePassMissionPointReq>() {
                @Override
                public TakeBattlePassMissionPointReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new TakeBattlePassMissionPointReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TakeBattlePassMissionPointReqOrBuilder
        {
            private int bitField0_;
            private Internal.IntList missionIdList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return TakeBattlePassMissionPointReqOuterClass.internal_static_TakeBattlePassMissionPointReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return TakeBattlePassMissionPointReqOuterClass.internal_static_TakeBattlePassMissionPointReq_fieldAccessorTable.ensureFieldAccessorsInitialized(TakeBattlePassMissionPointReq.class, Builder.class);
            }
            
            private Builder() {
                this.missionIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.missionIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (TakeBattlePassMissionPointReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.missionIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return TakeBattlePassMissionPointReqOuterClass.internal_static_TakeBattlePassMissionPointReq_descriptor;
            }
            
            @Override
            public TakeBattlePassMissionPointReq getDefaultInstanceForType() {
                return TakeBattlePassMissionPointReq.getDefaultInstance();
            }
            
            @Override
            public TakeBattlePassMissionPointReq build() {
                final TakeBattlePassMissionPointReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public TakeBattlePassMissionPointReq buildPartial() {
                final TakeBattlePassMissionPointReq result = new TakeBattlePassMissionPointReq(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.missionIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.missionIdList_ = this.missionIdList_;
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
                if (other instanceof TakeBattlePassMissionPointReq) {
                    return this.mergeFrom((TakeBattlePassMissionPointReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final TakeBattlePassMissionPointReq other) {
                if (other == TakeBattlePassMissionPointReq.getDefaultInstance()) {
                    return this;
                }
                if (!other.missionIdList_.isEmpty()) {
                    if (this.missionIdList_.isEmpty()) {
                        this.missionIdList_ = other.missionIdList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureMissionIdListIsMutable();
                        this.missionIdList_.addAll(other.missionIdList_);
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
                TakeBattlePassMissionPointReq parsedMessage = null;
                try {
                    parsedMessage = TakeBattlePassMissionPointReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (TakeBattlePassMissionPointReq)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureMissionIdListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.missionIdList_ = GeneratedMessageV3.mutableCopy(this.missionIdList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getMissionIdListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.missionIdList_) : this.missionIdList_;
            }
            
            @Override
            public int getMissionIdListCount() {
                return this.missionIdList_.size();
            }
            
            @Override
            public int getMissionIdList(final int index) {
                return this.missionIdList_.getInt(index);
            }
            
            public Builder setMissionIdList(final int index, final int value) {
                this.ensureMissionIdListIsMutable();
                this.missionIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addMissionIdList(final int value) {
                this.ensureMissionIdListIsMutable();
                this.missionIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllMissionIdList(final Iterable<? extends Integer> values) {
                this.ensureMissionIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.missionIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearMissionIdList() {
                this.missionIdList_ = GeneratedMessageV3.emptyIntList();
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
    
    public interface TakeBattlePassMissionPointReqOrBuilder extends MessageOrBuilder
    {
        List<Integer> getMissionIdListList();
        
        int getMissionIdListCount();
        
        int getMissionIdList(final int p0);
    }
}
