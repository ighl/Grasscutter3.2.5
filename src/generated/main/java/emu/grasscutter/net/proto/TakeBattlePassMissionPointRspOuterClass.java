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

public final class TakeBattlePassMissionPointRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_TakeBattlePassMissionPointRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_TakeBattlePassMissionPointRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private TakeBattlePassMissionPointRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return TakeBattlePassMissionPointRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n#TakeBattlePassMissionPointRsp.proto\"I\n\u001dTakeBattlePassMissionPointRsp\u0012\u000f\n\u0007retcode\u0018\u0004 \u0001(\u0005\u0012\u0017\n\u000fmission_id_list\u0018\u000b \u0003(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        TakeBattlePassMissionPointRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_TakeBattlePassMissionPointRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_TakeBattlePassMissionPointRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(TakeBattlePassMissionPointRspOuterClass.internal_static_TakeBattlePassMissionPointRsp_descriptor, new String[] { "Retcode", "MissionIdList" });
    }
    
    public static final class TakeBattlePassMissionPointRsp extends GeneratedMessageV3 implements TakeBattlePassMissionPointRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RETCODE_FIELD_NUMBER = 4;
        private int retcode_;
        public static final int MISSION_ID_LIST_FIELD_NUMBER = 11;
        private Internal.IntList missionIdList_;
        private int missionIdListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final TakeBattlePassMissionPointRsp DEFAULT_INSTANCE;
        private static final Parser<TakeBattlePassMissionPointRsp> PARSER;
        
        private TakeBattlePassMissionPointRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.missionIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private TakeBattlePassMissionPointRsp() {
            this.missionIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.missionIdList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new TakeBattlePassMissionPointRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private TakeBattlePassMissionPointRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 32: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 88: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.missionIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.missionIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 90: {
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
            return TakeBattlePassMissionPointRspOuterClass.internal_static_TakeBattlePassMissionPointRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return TakeBattlePassMissionPointRspOuterClass.internal_static_TakeBattlePassMissionPointRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(TakeBattlePassMissionPointRsp.class, Builder.class);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
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
            if (this.retcode_ != 0) {
                output.writeInt32(4, this.retcode_);
            }
            if (this.getMissionIdListList().size() > 0) {
                output.writeUInt32NoTag(90);
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
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(4, this.retcode_);
            }
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
            if (!(obj instanceof TakeBattlePassMissionPointRsp)) {
                return super.equals(obj);
            }
            final TakeBattlePassMissionPointRsp other = (TakeBattlePassMissionPointRsp)obj;
            return this.getRetcode() == other.getRetcode() && this.getMissionIdListList().equals(other.getMissionIdListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getRetcode();
            if (this.getMissionIdListCount() > 0) {
                hash = 37 * hash + 11;
                hash = 53 * hash + this.getMissionIdListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static TakeBattlePassMissionPointRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return TakeBattlePassMissionPointRsp.PARSER.parseFrom(data);
        }
        
        public static TakeBattlePassMissionPointRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TakeBattlePassMissionPointRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TakeBattlePassMissionPointRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return TakeBattlePassMissionPointRsp.PARSER.parseFrom(data);
        }
        
        public static TakeBattlePassMissionPointRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TakeBattlePassMissionPointRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TakeBattlePassMissionPointRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return TakeBattlePassMissionPointRsp.PARSER.parseFrom(data);
        }
        
        public static TakeBattlePassMissionPointRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TakeBattlePassMissionPointRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TakeBattlePassMissionPointRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeBattlePassMissionPointRsp.PARSER, input);
        }
        
        public static TakeBattlePassMissionPointRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeBattlePassMissionPointRsp.PARSER, input, extensionRegistry);
        }
        
        public static TakeBattlePassMissionPointRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TakeBattlePassMissionPointRsp.PARSER, input);
        }
        
        public static TakeBattlePassMissionPointRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TakeBattlePassMissionPointRsp.PARSER, input, extensionRegistry);
        }
        
        public static TakeBattlePassMissionPointRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeBattlePassMissionPointRsp.PARSER, input);
        }
        
        public static TakeBattlePassMissionPointRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeBattlePassMissionPointRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return TakeBattlePassMissionPointRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final TakeBattlePassMissionPointRsp prototype) {
            return TakeBattlePassMissionPointRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == TakeBattlePassMissionPointRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static TakeBattlePassMissionPointRsp getDefaultInstance() {
            return TakeBattlePassMissionPointRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<TakeBattlePassMissionPointRsp> parser() {
            return TakeBattlePassMissionPointRsp.PARSER;
        }
        
        @Override
        public Parser<TakeBattlePassMissionPointRsp> getParserForType() {
            return TakeBattlePassMissionPointRsp.PARSER;
        }
        
        @Override
        public TakeBattlePassMissionPointRsp getDefaultInstanceForType() {
            return TakeBattlePassMissionPointRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new TakeBattlePassMissionPointRsp();
            PARSER = new AbstractParser<TakeBattlePassMissionPointRsp>() {
                @Override
                public TakeBattlePassMissionPointRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new TakeBattlePassMissionPointRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TakeBattlePassMissionPointRspOrBuilder
        {
            private int bitField0_;
            private int retcode_;
            private Internal.IntList missionIdList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return TakeBattlePassMissionPointRspOuterClass.internal_static_TakeBattlePassMissionPointRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return TakeBattlePassMissionPointRspOuterClass.internal_static_TakeBattlePassMissionPointRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(TakeBattlePassMissionPointRsp.class, Builder.class);
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
                if (TakeBattlePassMissionPointRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                this.missionIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return TakeBattlePassMissionPointRspOuterClass.internal_static_TakeBattlePassMissionPointRsp_descriptor;
            }
            
            @Override
            public TakeBattlePassMissionPointRsp getDefaultInstanceForType() {
                return TakeBattlePassMissionPointRsp.getDefaultInstance();
            }
            
            @Override
            public TakeBattlePassMissionPointRsp build() {
                final TakeBattlePassMissionPointRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public TakeBattlePassMissionPointRsp buildPartial() {
                final TakeBattlePassMissionPointRsp result = new TakeBattlePassMissionPointRsp(this);
                final int from_bitField0_ = this.bitField0_;
                result.retcode_ = this.retcode_;
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
                if (other instanceof TakeBattlePassMissionPointRsp) {
                    return this.mergeFrom((TakeBattlePassMissionPointRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final TakeBattlePassMissionPointRsp other) {
                if (other == TakeBattlePassMissionPointRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
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
                TakeBattlePassMissionPointRsp parsedMessage = null;
                try {
                    parsedMessage = TakeBattlePassMissionPointRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (TakeBattlePassMissionPointRsp)e.getUnfinishedMessage();
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
    
    public interface TakeBattlePassMissionPointRspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
        
        List<Integer> getMissionIdListList();
        
        int getMissionIdListCount();
        
        int getMissionIdList(final int p0);
    }
}
